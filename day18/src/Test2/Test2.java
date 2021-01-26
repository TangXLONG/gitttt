package Test2;

import java.util.Scanner;

public class Test2 { public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("请输入第一个数:");
    int num1=sc.nextInt();
    System.out.print("请输入第二个数:");
    int num2=sc.nextInt();
    int num;
    if (num1>num2){
        num=num2;
    }else {
        num=num1;
    }
    for (int i=num;i>0;i--){
        if (num1%i==0&&num2%i==0){
            System.out.println("公约数为："+i);
            break;
        }
    }
}
}
