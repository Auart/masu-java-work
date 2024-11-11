/**
 * Description: TODO
 *
 * @author auart
 */
public class Main {
//定义没有参数的info()方法
        void info(){
            System.out.println("0 years old");

        }

        void info(int age){
            System.out.printf("%d years old\n",age);
        }


//定义有整型参数的info()方法

    public static void main(String[] args) {
        Main ov=new Main();//创建Main类对象
        ov.info();//测试无参数的info()方法
        for(int i=1;i<=10;i++) {//测试有参数的info()方法
            ov.info(i);
        }
    }
}
