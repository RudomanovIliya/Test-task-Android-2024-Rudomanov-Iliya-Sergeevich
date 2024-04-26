class NewPosters {
    private val subs = mutableListOf<Subscriber>()

    fun subscribe(sub: Subscriber) {
        subs.add(sub)
    }

    fun unsubscribe(sub: Subscriber) {
        subs.remove(sub)
    }

    private fun notifySubscribers(news: String) {
        for (sub in subs) {
            sub.update(news)
        }
    }

    fun postNews(news: String) {
        println("New info: $news")
        notifySubscribers(news)
    }
}