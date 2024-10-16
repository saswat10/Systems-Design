package lowLevelPatterns.observerPattern.observer

import lowLevelPatterns.observerPattern.observable.StockObservable

class MobileNotificationObserver(
    private val username:String,
    private val observable: StockObservable
): NotificationAlertObserver {

    override fun update() {
        sendMsg(username, "Product is in Stock, Hurry up!!")
    }

    private fun sendMsg(username: String, s: String){
        println("Message sent to = $username")
    }
}