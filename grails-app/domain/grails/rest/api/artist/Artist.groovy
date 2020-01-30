package grails.rest.api.artist


import grails.rest.*

//@Resource(uri = '/api/artists', readOnly = false, formats = ['json', 'xml'])
class Artist {
    String firstName
    String lastName
    Date dateCreated
    Date lastUpdated

    static constraints = {
        firstName blank: false
        lastName blank: false
    }
}