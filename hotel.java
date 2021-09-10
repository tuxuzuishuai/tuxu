public class hotel {
    private room[][] Room;
    public hotel() {
        Room = new room[3][10];
        for (int i = 0 ;i < Room.length ;i++){
            for(int j = 0 ;j < Room[i].length; j++){
                if(i==0){
                    Room[i][j]= new room((i+1)*100+j+1,"单人间",true);
                }
                else if(i==1){
                    Room[i][j]= new room((i+1)*100+j+1,"标准间",true);
                }
                else if(i == 2){//=else光标
                    Room[i][j]= new room((i+1)*100+j+1,"豪华间",true);
                }
            }
        }
    }
    public void dingfang(int no){
        Room[no/100-1][no%100-1].setZhuangtai(false);
        System.out.println("订房成功");
    }
    public void tuifang(int no){
        Room[no/100-1][no%100-1].setZhuangtai(true);
        System.out.println("退房成功");

    }
    public  void printf(){
        for (int i = 0; i <Room.length ; i++) {
            for (int j = 0; j <Room[i].length ; j++) {
                System.out.println(Room[i][j].toString());

            }

        }
    }
}









