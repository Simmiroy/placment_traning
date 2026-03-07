package collection.lambda;

import java.util.ArrayList;
import java.util.Collections;

class Product{
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
public class ItemSorting {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Product("Mobile",20000,5));
        products.add(new Product("Headphones",25000,10));
        products.add(new Product("Charger",265000,1));
        for (Product p:products){
            System.out.println(p.name+" ,"+ p.price+", "+p.quantity);
        }
        Collections.sort(products ,(p1,p2)->p2.quantity-p1.quantity);
        for (Product p:products){
            System.out.println(p.name+" ,"+ p.price+", "+p.quantity);
        }
   }

}
