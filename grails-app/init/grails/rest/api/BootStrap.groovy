package grails.rest.api

import grails.rest.api.security.Role
import grails.rest.api.security.User
import grails.rest.api.security.UserRole

class BootStrap {

    def init = { servletContext ->
        /*def adminRole = new Role('ROLE_ADMIN').save()
        def userRole = new Role('ROLE_USER').save()

        def testUser = new User('me', 'password').save()
        def adminUser = new User('admin', 'admin').save()

        UserRole.create testUser, userRole
        UserRole.create adminUser, adminRole

        UserRole.withTransaction { status ->
            UserRole.withSession {
                it.flush()
                it.clear()
            }
        }

        assert User.count() == 2
        assert Role.count() == 2
        assert UserRole.count() == 2*/

        //register JSON marshaller for Date
        grails.converters.JSON.registerObjectMarshaller(Date){
            return it?.format('MM/dd/yyyy')
        }
        //register JSON marshaller for UUID
        grails.converters.JSON.registerObjectMarshaller(UUID){
            return it?.toString()
        }
    }

    def destroy = {
    }
}
