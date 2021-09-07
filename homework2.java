public class homework2 {
    public static void main(String[] args) {
        int[] a = new int[200];
        int i = 2;
        a[0]=1;
        a[1]=1;
        while(i < 100){
            a[i] = a[i-1] + a[i-2];
            i++;

        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }

    }
}
