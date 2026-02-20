package day1;

public class pat {
    public static void main(String[] args) {
//        for(int i=0; i<5; i++){
//            for(int j=0; j<5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=0; i<5;i++){
//            for(int j=0; j<5; j++){
//                if(i==0 || i==4 || j==0||j==4){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        System.out.println();
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

