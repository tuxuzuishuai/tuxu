import java.util.Arrays;
import java.util.Random;

public class homework5 {
    public static void main(String[] args) {
        int[] a = new int[20];
        int b= 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }
        Random randomshu = new Random();
        int index = 0;
        while(b < a.length){
            int num = randomshu.nextInt(459);
            a[index] = num;
            index++;
            b++;

        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 77 && a[i] <459){
                System.out.println(a[i]+"这个数大于77小于459");
            }
        }
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum +a[i];
        }
        System.out.println("这个数组的平均数是"+sum/20);
        for (int i = 0; i < a.length; i++) {
            if(a[i] > sum/20 ){
                System.out.println(a[i]+"这个数大于平均数");
            }
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println("最小数是"+a[0]+"最大数是"+a[20]);
        }



    }
}
