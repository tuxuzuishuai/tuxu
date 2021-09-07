import java.util.Scanner;
public class homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = n * m;
        int t;
        if(n < m) {
            t = n;
            n = m;
            m = t;
        }
        while(m != 0) {
            t = n % m;
            n = m;
            m = t;
        }
        System.out.println("最小公约数是"+n+"\n"+"最大公倍数是"+ sum / n);


    }
}

