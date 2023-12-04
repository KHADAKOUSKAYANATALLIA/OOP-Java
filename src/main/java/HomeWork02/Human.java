package HomeWork02;

public class Human extends Actor {
    public Human(String name) {
        super(name);
    }


    @Override
    String getName() {
        return super.name;
    }


    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;

    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;

    }


    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
}
/*
Необходимо реализовать класс Human, который должен наследовать от Actor и реализовывать ActorBehavoir.
 */
