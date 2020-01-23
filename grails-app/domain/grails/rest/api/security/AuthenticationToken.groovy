package grails.rest.api.security

class AuthenticationToken {
    String tokenValue
    String username

    static mapping = {
        version false
    }

    static constraints = {
    }
}
