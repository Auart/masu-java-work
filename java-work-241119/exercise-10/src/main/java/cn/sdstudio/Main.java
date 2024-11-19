package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
class A {
    //创建方法f ,输岀英文字母表(a~z)
    public void f() {
        System.out.println("abcdefghijklmnopqrstuvwxyz");
    }

}
class B extends A{


    public void g() {
        System.out.println("αβγδεζηθικλμνξοπ");
    }
    //创建方法g，输岀希腊字母表(α~π)


}
public class Main{
    public static void main(String[] args) {
        B b=new B();
        b.f();
        System.out.println();
        b.g();
    }
}