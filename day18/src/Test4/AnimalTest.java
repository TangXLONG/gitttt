package Test4;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1=new Cat("小白","白色",4);
        Animal a2=new Dog("小黑","黑色",4);
        a1.eat("鱼");
        ((Cat) a1).catchMouse();
        a2.eat("骨头");
        ((Dog)a2).look();

    }
}
