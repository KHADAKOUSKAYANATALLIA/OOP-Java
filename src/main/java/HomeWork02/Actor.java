package HomeWork02;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();

    public Actor(String name) {
        this.name = name;
    }
}

/*
Необходимо реализовать абстрактный класс Actor, который хранит в себе параметры актора, включая состояние
готовности сделать заказ и факт получения заказа.
 */

