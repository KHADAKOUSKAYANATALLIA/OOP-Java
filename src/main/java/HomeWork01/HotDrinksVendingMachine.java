package HomeWork01;

/*
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре.
*/

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product item : productList)
            if (item.getName().equals(name))
                return item;
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) { //перегруженный метод getProduct
        for (Product item : productList)
            if (item.getName().equals(name) &&
                    (((HotDrink) item).getVolume() == volume) &&
                    (((HotDrink) item).getTemperature() == temperature)) {
                return item;
            }
        return null;
    }
}
