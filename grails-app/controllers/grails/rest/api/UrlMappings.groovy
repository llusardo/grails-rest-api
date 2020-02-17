package grails.rest.api

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        '/api/v1/products'(resources: 'product') {
            collection {
                '/search'(controller: 'product', action: 'search')
            }
            collection{
                '/rest-client-example'(controller: 'product', action: 'restClientExample', method: 'GET')
            }
        }

        '/api/v1/users'(resources: 'user')

        '/api/v1/roles'(resources: 'role')

        "/artists"(resources: 'artist')

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
