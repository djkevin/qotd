package qotd

class QuoteController {

    static defaultAction = "random"

    def index() {}

    def home() {
        render "<h1> real programmers do not each quiche</h1>"
    }

    def random() {
        def allQuotes = Quote.list()
        def randomQuote

        if (allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]

        } else {
            randomQuote = new Quote(author: "anonymous", content: "Kindness is the best quality of the soul.")
        }

        [quote: randomQuote]
    }
}
