package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(QuoteService)
class QuoteServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test static quote service always returns kindness quote"() {
        when:
        Quote staticQuote = service.getStaticQuote()

        then:
        staticQuote.author == "anonymous"
        staticQuote.content == "Kindness is the best quality of the soul."

    }
}
