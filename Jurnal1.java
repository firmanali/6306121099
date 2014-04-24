package jurnal.pkg1;
import java.util.Scanner;

public class Jurnal1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int n,x;
        Fibonacci f=new Fibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jumlah digit: ");
        n=sc.nextInt();
        for (int i=1; i<=n;i++){
            //x=f.hitungFibonacci(n);
            System.out.print(f.hitungFibonacci(i)+" ");
        }
    }
}
