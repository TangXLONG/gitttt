package Test4;

public class Dog extends Animal{
    @Override
    public void eat(String food) {
        System.out.println("狗吃"+food);
    }
    public void look(){
        System.out.println(this.color+"小狗看家");
    }

    public Dog(String name, String color, int legNum) {
        super(name, color, legNum);
    }
}
