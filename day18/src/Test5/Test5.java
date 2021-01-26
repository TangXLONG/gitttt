package Test5;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        String s1="电视机，洗衣机，冰箱，彩电，手机";
        System.out.println(s1);
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入需要添加的商品名称");
            String add=sc.nextLine();
            if (s1.indexOf(add)!=-1){
                String s2=s1.substring(0,s1.indexOf(add));
                String s3=s1.substring(s1.indexOf(add)+add.length()+1);
                s1=s2+s3+"，"+add;
                System.out.println(s1);
            }else {
                s1+="，"+add;
                System.out.println(s1);
            }
            System.out.println("是否继续添加商品（输入yes继续/输入其他退出）");
            String choose =sc.nextLine();
            if (choose.equals("yes")){
                continue;
            }else {
                break;
            }
        }
    }

}
