import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入消费金额：");
        double jine=sc.nextDouble();
        int discount=(int)(Math.random()*10+1);
        System.out.println("您抽到的折扣为："+discount+"折");
        System.out.println("折后价格为："+jine*discount*0.1);
    }
}
