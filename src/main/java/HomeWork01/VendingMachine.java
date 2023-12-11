package HomeWork01;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    public void initProduct(List<Product> productList); //инициализируем список с продуктами

    public Product getProduct(String name); //по имени возвращает продукт
}
