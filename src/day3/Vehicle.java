package day3;
class Vehicle {
     static void speed(int maxSpeed){
        System.out.println("speed= "+ maxSpeed);

    }
     public static class  Car extends Vehicle {
         static void speed(String mode) {
             System.out.print("drivind node of the car = "+mode);

         }

         public static void main(String[] args) {
//             Car ob = new Car();
//             ob.speed(54);
//             ob.speed("Sport");
             speed(54);
             speed("Sport");

         }
     }
}
