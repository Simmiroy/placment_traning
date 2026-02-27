package threads;

public class FoodOrder extends Thread {
    String task;
    FoodOrder(String task){
        this.task=task;
    }
    public void run(){
        System.out.println(task +" started");
    }

    public static void main(String[] args) {
        FoodOrder Cooking = new FoodOrder("Cooking");
        FoodOrder Packing = new FoodOrder("Packing");
        FoodOrder Delivery = new FoodOrder("Assigning the Delivery Agent");
        Cooking.start();
        Packing.start();
        Delivery.start();
    }
}
/*Points to remember

* Extends Thread
* Override run()
* Use start()
* It is less flexible because of inehritance limitation.

*/