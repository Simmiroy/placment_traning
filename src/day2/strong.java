package day2;

public class strong {
    int factorial(int d) {
        int fact = 1;
        for (int i = 1; i <= d; i++) {
            fact = fact * i;

        }
        return fact;
    }
        boolean isStrong(int n){
            int temp = n;
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                sum = sum + factorial(d);
                n = n / 10;
            }
            if (sum == temp) {
                return true;
            } else {
                return false;
            }

        }

    }

