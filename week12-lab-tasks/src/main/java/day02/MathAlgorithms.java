package day02;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b){
        int gcd = 1;
        for (int i =2; i<= a && i<= b;i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}