package HomeWork02;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Саша");
        Human human2 = new Human("Дима");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
