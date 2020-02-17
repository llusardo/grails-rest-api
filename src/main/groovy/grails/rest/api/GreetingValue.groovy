package grails.rest.api

class GreetingValue {
    Integer id
    String quote

    GreetingValue() {

    }

    GreetingValue(Integer id, String quote) {
        this.id = id
        this.quote = quote
    }
}
