package qotd

/**
 * Created by dj on 05.10.14.
 */
class QuoteAnalyzer {
    private final List<Quote> quotes

    QuoteAnalyzer(List<Quote> quotes){
        this.quotes = new ArrayList(quotes)
    }

    int getQuoteCount(){
        return this.quotes.size()
    }

    Map <String, Integer> getQuoteCountPerAuthor(){
        def result = [:]

        for (Quote quote in quotes){
            if (result.containsKey(quote.author)){
                result[quote.author] = result[quote.author] +  1
            }else {
                result[quote.author] = 1
            }
        }
        return result
    }

    def getAverageQuoteLength(){
        if(!quotes) return 0.0

        def totalSize = 0
        for (Quote q in quotes){
            totalSize +=q.content.size()
        }
        return totalSize / quotes.size()
    }

    //Closure version of the above method
    def getAverageQuoteLengthC(){
        return quotes.sum{ it.content.size() } / quotes.size()
    }
}
