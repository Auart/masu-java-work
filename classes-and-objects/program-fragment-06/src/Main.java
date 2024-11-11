/**
 * Description: TODO
 *
 * @author auart
 */

import java.util.Scanner;

class Person {
    //编写类Person，该类定义了3个成员变量（name代表姓名、gender代表性别、age代表年龄）和两个构造方法（无参数的使用默认值初始化成员变量，有参数的使用给定值初始化成员变量）。3个get方法分别用来获得姓名、性别和年龄。
    private String name;
    private int age;
    private String gender;

    public Person() {

    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;

    }



    public int getAge() {
        return age;
    }



    public String getGender() {
        return gender;
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("调用无参构造方法，并输出默认信息： ");
        //创建对象p1，调用Person类的无参构造方法
        Person p1 = new Person();

        System.out.println("姓名:" + p1.getName());
        System.out.println("性别:" + p1.getGender());
        System.out.println("年龄:" + p1.getAge());
        System.out.println("调用有参构造方法，通过键盘录入个人信息并输出 ：");
        // 创建对象p2，调用Person类的有参构造方法，并通过键盘录入个人信息
        Person p2 = new Person("张三", 23, "男");

        System.out.println("姓名:" + p2.getName());
        System.out.println("性别:" + p2.getGender());
        System.out.println("年龄:" + p2.getAge());

    }
}