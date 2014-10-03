import qotd.Quote

class BootStrap {

    def init = { servletContext ->
        new qotd.Quote (author:"Anonymous", content:"He who asks is a fool for five minutes, but he who does not ask remains a fool forever").save()
        new qotd.Quote (author:"Chinese proverb", content:"Do not use a hatchet to remove a fly from your friend's forehead").save()
        new qotd.Quote (author:"Chinese proverb", content:"If you are planning for a year, sow rice; if you are planning for a decade, plant trees; if you are planning for a lifetime, educate people").save()

        assert Quote.count() == 3
    }
    def destroy = {
    }
}
