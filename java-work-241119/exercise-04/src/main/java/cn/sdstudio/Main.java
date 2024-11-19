package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();//输入英雄名
        String s = in.next();//输入英雄所掌握的语言名
        String emp = in.next();//输入英雄所掌握的功夫名
        Swim swim = new Hero(name);
        swim.swim();
        Fly fly = new Hero(name);
        fly.fly();
        AdventureMan a = new Hero(name);
        a.speak(s);
        a.fight(emp);
    }
}
interface Swim {
    void swim();
}
interface Fly {
    void fly();
}
abstract class AdventureMan {
    abstract void fight(String emp);
    abstract void speak(String s);
}

class Hero extends AdventureMan implements Swim, Fly
//Hero类继承了AdventureMan的同时也实现了Swim和Fly接口
{
    //Hero类中包含一个成员变量和给该成员变量赋初始值的构造方法
    public String name;
    public Hero(String name) {
        this.name = name;
    }

    @Override
    void fight(String emp) {

        System.out.println(this.name+"can "+emp);
    }

    @Override
    void speak(String s) {
        System.out.println(this.name+"can "+s);
    }

    @Override
    public void swim() {
        System.out.println(this.name+"can swim");
    }

    @Override
    public void fly() {
        System.out.println(this.name+"can fly");
    }




}

