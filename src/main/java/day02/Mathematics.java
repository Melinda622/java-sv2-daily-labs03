package day02;

public class Mathematics {
    public boolean isPrime(int number) {
        int numberofDivisors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberofDivisors++;
            }
        }
        if (numberofDivisors == 2) {
            return true;
        }
        return false;
    }
}
