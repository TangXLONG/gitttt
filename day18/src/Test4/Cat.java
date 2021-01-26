package Test4;

public class Cat extends Animal{
    @Override
    public void eat(String food) {
        System.out.println("猫吃"+food);
    }

    public Cat(String name, String color, int legNum) {
        super(name, color, legNum);
    }

    public void catchMouse(){
        System.out.println(this.color+"小猫咪抓老鼠");
    }
}
