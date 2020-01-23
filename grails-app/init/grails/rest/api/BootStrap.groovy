package grails.rest.api

import grails.rest.api.security.Role
import grails.rest.api.security.User
import grails.rest.api.security.UserRole

class BootStrap {

    def init = { servletContext ->
        def roleUser = new Role('ROLE_ADMIN').save()
        def user = new User("admin", "admin").save()
        UserRole.create user, roleUser
    }

    def destroy = {
    }
}
