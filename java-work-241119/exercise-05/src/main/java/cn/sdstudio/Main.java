package cn.sdstudio;

import java.util.*;
public class Main {
    public static void main (String args[ ]) {
        int a,b;
        Scanner reader=new Scanner(System.in);
        a=reader.nextInt();
        b=reader.nextInt();
        A Oa=new A();
        System.out.println(a+"和"+b+"的最大公约数 ："+Oa.f(a,b));
        Oa = new B();
        System.out.print(a+"和"+b+"的最小公倍数 ："+Oa.f(a,b));
    }
}
class A {

    //该类有一个方法public int f(int a,int b),该方法返回a和b的最大公约数
    public int f(int a, int b) {
        int min =a<b?a:b;
        for(int i=min;i>0;i--) {
            if(a%i==0 && b%i==0) {
                min=i;
                break;
            }
        }
        int max=a*b/min;
        return max ;
    }

}
class B extends A {
    //重写方法f，而且重写的方法将返回a和b的最小公倍数
    @Override
    public int f(int a, int b) {
        int min =a<b?a:b;
        for(int i=min;i>0;i--) {
            if(a%i==0 && b%i==0) {
                min=i;
                break;
            }
        }
        return min;
    }
}
