package jurnal.pkg1;

public class Fibonacci {
    public int hitungFibonacci(int n){
        if (n<=1) return n;
        else return hitungFibonacci(n-1) + hitungFibonacci(n-2);
    }
}
