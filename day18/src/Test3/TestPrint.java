package Test3;

public class TestPrint {
    public static void main(String[] args) {
        Printer p1=new DoMatriPrinter();
        Printer p2=new InKperPrinter();
        Printer p3=new LasterPrinter();
        p1.print();
        p2.print();
        p3.print();
    }
}
