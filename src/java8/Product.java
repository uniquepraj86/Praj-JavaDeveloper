package java8;

import java.util.ArrayList;
import java.util.List;
public class Product {
    int id;
    String name;
    double salary;

    public Product(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Product> ProductList = new ArrayList<>();
        ProductList.add(new Product(1, "Madhuri", 20000));
        ProductList.add(new Product(2, "Xyz", 30000));
        ProductList.add(new Product(3, "Abhijeet", 10000));
        ProductList.add(new Product(4, "Nikhil", 9000));


        ProductList.stream().filter(product -> product.salary > 10000).forEach(product -> System.out.println(product.salary));

    }
}

