package HomeWork01;

public abstract class Product {
    private String name;
    private int cost;


    public Product(String name, int cost) { //Конструктор для класса Product
        this.name = name;
        this.cost = cost;
    }

    public String getName() { //имя возвращает
        return name;
    }

    public void setName(String name) { //принимает новое имя и сохраняет его
        this.name = name;
    }

    public int getCost() { //возвращает текущую цену
        return cost;
    }

    public void setCost(int cost) { //принимает новую цену и сохраняет ее
        this.cost = cost;           //меняет нашу цену
    }

    @Override //переопределили метод toString
    public String toString() { // вывод в корректном формате
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
