package HomeWork02;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor); //заходить в магазин
    void releaseFromMarket(List<Actor> actor); //принимает список, выгоняет людей из магазина
    void update(); //обновляет информацию про магазин
}

/*
Необходимо реализовать интерфейс MarketBehaviour, который описывает логику магазина - приход/уход покупателей,
обновление состояния магазина.
 */