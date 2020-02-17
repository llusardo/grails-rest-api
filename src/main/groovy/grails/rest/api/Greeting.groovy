package grails.rest.api

import grails.compiler.GrailsCompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@GrailsCompileStatic
@ToString(includeNames=true, includePackage=false)
class Greeting {
    String type
    GreetingValue value

    Greeting() {

    }

    Greeting(String type, GreetingValue value) {
        this.type = type
        this.value = value
    }
}
