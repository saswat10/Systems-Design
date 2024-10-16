package lowLevelPatterns.observerPattern.observer

import lowLevelPatterns.observerPattern.observable.StockObservable

class EmailNotificationObserver(
    private val emailId: String,
    private val observable: StockObservable
) : NotificationAlertObserver {


    override fun update() {
        sendMail(emailId, "Product is in stock, Hurry up!!")
    }

    private fun sendMail(emailId: String, s: String) {
        println("Email sent to: $emailId")
        // Send the actual email to the end user
    }
}
