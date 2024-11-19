package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.*;
abstract class Animal{
//Animal抽象类有2个抽象方法cry()和getAnimalName()，表示叫声和种类名称。
    abstract void cry();
    abstract void getAnimalName();
}
class Simulator{
    public void playSound(Animal animal) {
        animal.cry();
        animal.getAnimalName();
    }
    // Simulator类中有一个playSound(Animal animal)方法，该方法的参数是Animal类型。即参数animal可以调用Animal的子类重写的cry()方法输出动物叫声，调用子类重写的getAnimalName()方法显示动物种类的名称。


}
class Dog extends Animal{
    private String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    void cry() {
        System.out.println(this.name);
    }

    @Override
    void getAnimalName() {
        System.out.println("汪汪汪！");
    }
    //编写Animal类的子类Dog类。


}
class Cat extends Animal{
    private String name;
    public Cat(String name) {
            this.name = name;
    }

    @Override
    void cry() {
        System.out.println(this.name);
    }

    @Override
    void getAnimalName() {
        System.out.println("喵喵喵！");
    }
    //编写Animal类的子类Cat类。


}
class Main{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String name1 = r.next();
        String name2 = r.next();
        Simulator b = new Simulator();
        Animal animal;
        animal = new Cat(name1);
        b.playSound(animal);
        animal = new Dog(name2);
        b.playSound(animal);

    }
}
