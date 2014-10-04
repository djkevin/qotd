package qotd

import grails.transaction.Transactional

@Transactional
class QuoteService {

    def getStaticQuote() {
        new Quote(author: "anonymous", content: "Kindness is the best quality of the soul.")
    }

    def getRandomQuote(){
        def allQuotes = Quote.list()
        def randomQuote = null

        if (allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = allQuotes[randomIdx]

        } else {
            randomQuote = getStaticQuote()
        }
    }
}
