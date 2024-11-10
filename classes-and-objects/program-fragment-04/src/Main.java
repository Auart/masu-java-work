/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.*;
public class Main{
    private int n1;
    private int n2;
    private int n3;
    private String str1;
    private String str2;

    //按题目要求创建3个构造方法分别求最大值，乘积和字符串匹配
    public Main(int n1, int n2){
        if(n1 > n2){
            System.out.println("最大值是："+n1);
        }else{
            System.out.println("最大值是："+n2);
        }

    }

    public Main(int n1, int n2, int n3){
        System.out.println("三数的乘积是："+(n1*n2*n3));
    }

    public Main(String str1, String str2){
        if(str1 != null && str2 != null){
            if(str1.equals(str2)){
                System.out.println("两字符串相同");
            }else{
                System.out.println("两字符串不相同");
            }
        }
    }

    public static void main(String[] dasd) {
        //键盘录入3个整型和2个字符串
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        Main c=new Main(n1,n2);
        Main c1=new Main(n1,n2,n3);
        Main c2=new Main(str1,str2);
    }
}
