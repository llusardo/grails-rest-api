package grails.rest.api.security

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*
import groovy.transform.CompileStatic

@CompileStatic
class RoleController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RoleController() {
        super(Role)
    }

    @Secured('permitAll')
    @Override
    def index(Integer max) {
        super.index(max)
    }

    @Secured('permitAll')
    @Override
    def show() {
        super.show()
    }

    @Secured('permitAll')
    @Override
    def save() {
        super.save()
    }

    @Secured('permitAll')
    @Override
    def update() {
        super.update()
    }

    @Secured('permitAll')
    @Override
    def delete() {
        super.delete()
    }
}
