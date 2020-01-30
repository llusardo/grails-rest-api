package grails.rest.api.artist

import grails.plugin.springsecurity.annotation.Secured
import grails.rest.*
import grails.converters.*

class ArtistController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ArtistController() {
        super(Artist)
    }
    //@Secured('ROLE_ADMIN')
    @Secured('permitAll')
    @Override
    def index(Integer max) {
        super.index(max)
    }
    //@Secured('ROLE_ADMIN')
    @Secured(['ROLE_USER', 'ROLE_ADMIN'])
    @Override
    def show() {
        super.show()
    }
    //@Secured('ROLE_ADMIN')
    //@Secured('ROLE_ADMIN')
    @Override
    def save() {
        super.save()
    }
    //@Secured('ROLE_ADMIN')
    //@Secured('ROLE_USER')
    @Override
    def update() {
        super.update()
    }
    //@Secured('ROLE_ADMIN')
    //@Secured('ROLE_ADMIN')
    @Override
    def delete() {
        super.delete()
    }
}
