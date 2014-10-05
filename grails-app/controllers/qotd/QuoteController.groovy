package qotd

class QuoteController {

    static defaultAction = "random"
    def quoteService

    static scaffold = true

   // def index() {}

    def home() {
        render "<h1> real programmers do not each quiche</h1>"
    }

    def random() {
        def randomQuote = quoteService.getRandomQuote()
        [quote: randomQuote]
    }

    def ajaxRandom(){
        def randomQuote = quoteService.getRandomQuote()
        render {
            q(randomQuote.content)
            p(randomQuote.author)
        }
    }
}
