package HomeWork02;

public interface QueueBehaviour {
    void takeInQueue(Actor actor); //зайти в очередь
    void makeOrders(); // сделать заказ
    void takeOrders(); //получить заказ
    void releaseFromQueue(); //выйти из очереди

}


/*
Необходимо реализовать интерфейс QueueBehaviour, который описывает логику очереди - помещение в/освобождение
из очереди, принятие/отдача заказа.
 */