import java.util.Scanner;

public class hoteltest {
    public static void main(String[] args) {
        hotel a = new hotel();
        System.out.println("欢迎使用酒店管理系统");
        while(true) {
        System.out.println("如果要订房请按1，如果要退房请按2，如果要查看房间状态请按3");
        Scanner no = new Scanner(System.in);
        int i= no.nextInt();
            if (i == 1) {
                System.out.println("请输入房间号");
                int roomno = no.nextInt();
                a.dingfang(roomno);

            }
            if (i == 2) {
                System.out.println("请输入房间号");
                int roomno = no.nextInt();
                a.tuifang(roomno);

            }
            if (i == 3) {
                a.printf();
                System.out.println("查看成功");
            }
        }


    }
}
