package lowLevelPatterns.observerPattern

import lowLevelPatterns.observerPattern.observable.IphoneObservable
import lowLevelPatterns.observerPattern.observer.EmailNotificationObserver
import lowLevelPatterns.observerPattern.observer.MobileNotificationObserver

class Store {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val iphoneStockObservable =  IphoneObservable()

            /** @see kotlin initialization */
            iphoneStockObservable.initializeObserverList()

            val observer1 = EmailNotificationObserver("xyz1@gmail.com", iphoneStockObservable)
            val observer2 = EmailNotificationObserver("xyz2@gmail.com", iphoneStockObservable)
            val observer3 = MobileNotificationObserver("xyz_username", iphoneStockObservable)

            iphoneStockObservable.add(observer1)
            iphoneStockObservable.add(observer2)
            iphoneStockObservable.add(observer3)


            iphoneStockObservable.setStockCount(10)
        }
    }
}