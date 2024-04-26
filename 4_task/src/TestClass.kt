class TestClass(private val link:String) : Subscriber {
    override fun update(news: String) {
        println("$news, new info to $link")
    }
}