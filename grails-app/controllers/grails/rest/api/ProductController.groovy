package grails.rest.api

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController

import groovy.transform.CompileStatic
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.client.BlockingHttpClient
import io.micronaut.http.client.HttpClient


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

    @Secured('permitAll')
    def restClientExample(){
        String baseUrl = "https://gturnquist-quoters.cfapps.io"
        BlockingHttpClient client = HttpClient.create(baseUrl.toURL()).toBlocking()
        HttpRequest request = HttpRequest.GET("/api/random")
        HttpResponse<String> resp = client.exchange(request, String) as HttpResponse<String>

        String json = resp.body()
        ObjectMapper objectMapper = new ObjectMapper()
        Greeting greeting = objectMapper.readValue(json, Greeting)
        respond greeting
    }
}