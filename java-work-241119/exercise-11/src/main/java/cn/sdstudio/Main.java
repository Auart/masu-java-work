package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
public class Main {
    public static void main(String[] args) {
        RedBuble redBuble=new RedBuble();
        redBuble.faLiang();
        GreenBuble blueBuble=new GreenBuble();
        blueBuble.faLiang();
    }
}

class Buble  {//灯泡类
    public void faLiang(){
        System.out.println("灯泡可以发亮");
    }
}

class GreenBuble extends Buble {
//重写faLiang()，输出发绿光

    @Override
    public void faLiang() {
        System.out.println("发绿光");
    }
}

class RedBuble extends Buble {
//重写faLiang()，输出发红光

    @Override
    public void faLiang() {
        System.out.println("发红光");
    }
}
