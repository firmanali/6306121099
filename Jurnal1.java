package jurnal.pkg1;
import java.util.Scanner;

public class Jurnal1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int n,x;
        String str1=new String();
        String str2=new String();
        Fibonacci f=new Fibonacci();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jumlah digit: ");
        n=sc.nextInt();
        for (int i=1; i<=n;i++){
            str1=Integer.toString(f.hitungFibonacci(i));
            str2=str1+" "+str2;
        }
        System.out.println(str2);
    }
}
