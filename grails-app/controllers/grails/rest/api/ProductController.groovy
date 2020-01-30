package grails.rest.api

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController

import groovy.transform.CompileStatic

@CompileStatic
class ProductController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ProductController() {
        super(Product)
    }
    ProductService productService

    @Secured('permitAll')
    @Override
    def index(Integer max) {
        super.index(max)
    }

    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    @Override
    def show() {
        super.show()
    }

    @Secured('ROLE_ADMIN')
    @Override
    def save() {
        super.save()
    }

    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    @Override
    def update() {
        super.update()
    }

    @Secured('ROLE_ADMIN')
    @Override
    def delete() {
        super.delete()
    }

    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    def search(String q, Integer max ) {
        if (q) {
            respond productService.findByNameLike("%${q}%".toString(), [max: Math.min( max ?: 10, 100)]) // <3>
        }
        else {
            respond([])
        }
    }
}