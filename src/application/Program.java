package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        Product p1 = new Product("Notebook", 1200.43);
        Product p2 = new Product("Monitor", 240.99);
        Product p3 = new Product("Keyboard", 99.90);

        Comparator<Product> comp = (o1, o2) -> {
         return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase()); };

        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.sort(comp);

        for( Product l: list){
        System.out.println(l);
    }
    }
}
