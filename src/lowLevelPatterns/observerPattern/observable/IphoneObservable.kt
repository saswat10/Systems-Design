package lowLevelPatterns.observerPattern.observable

import lowLevelPatterns.observerPattern.observer.NotificationAlertObserver

class IphoneObservable: StockObservable {

    private lateinit var observerList: MutableList<NotificationAlertObserver>

    fun initializeObserverList(){
        observerList= mutableListOf()
    }

    private var stockCount = 8

    override fun add(observer: NotificationAlertObserver) {
        observerList.add(observer)
    }

    override fun remove(observer: NotificationAlertObserver) {
        observerList.remove(observer)
    }

    override fun notifySubscribers() {
        for(observer in observerList){
            observer.update()
        }
    }

    override fun setStockCount(newStockCount: Int) {
        if(stockCount == 8){
            notifySubscribers()
        }
        stockCount += newStockCount

    }

    override fun getStockCount(): Int {
        return stockCount
    }
}