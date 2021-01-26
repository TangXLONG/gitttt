package Test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一行字符：");
        String str=sc.nextLine();
        //String str=sc.next();
        char[]c1=str.toCharArray();
        System.out.println(c1.length);
        System.out.println("------");
        for (int i=0;i<c1.length;i++){
            System.out.print(c1[i]+"\t");
        }
        System.out.println();
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for (int i=0;i<c1.length;i++){
            if (c1[i]==' '){
                c++;
            }else if (c1[i]>='0'&&c1[i]<='9'){
                a++;
            }else if ((c1[i]>=65&&c1[i]<=90)||(c1[i]>=97&&c1[i]<=122)){
                b++;
            }else {
                d++;
            }
        }
        System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t");
    }
}
