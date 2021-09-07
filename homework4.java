public class homework4 {
    public static void main(String[] args) {
        int d =0;
        int x = 0;
        char[] a = {'a','s','v','s'};
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 'a'){
                d++;

            }
            else if(a[i] == 's'){
                x++;


            }
        }
        System.out.println("a出现了"+d+"次"+"s出现了"+x+"次");
    }
}
