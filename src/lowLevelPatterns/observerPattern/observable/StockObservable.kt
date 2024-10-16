package lowLevelPatterns.observerPattern.observable

import lowLevelPatterns.observerPattern.observer.NotificationAlertObserver

interface StockObservable {

    fun add(observer: NotificationAlertObserver)

    fun remove(observer: NotificationAlertObserver)

    fun notifySubscribers()

    fun setStockCount(newStockCount: Int)

    fun getStockCount(): Int
}