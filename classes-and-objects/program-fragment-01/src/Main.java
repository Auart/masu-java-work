import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Description: TODO
 *
 * @author auart
 */
public class Main {
    private int n1;
    private int n2;

    public Main(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void addition() {
        System.out.println("Add:"+(n1 + n2));
    }

    public void subtraction() {
        System.out.println("Sub:"+(n1 - n2));
    }

    public void multiplication() {
        System.out.println("Mul:"+(n1 * n2));
    }
    public void division() {
//        DecimalFormat df = new DecimalFormat("0.000");
//        String format = df.format((double) n1 / n2);
        System.out.printf("Div:%8.3f",(float)(n1 / n2));
        //注意：其中两数的商是指第一个操作数除以第二个操作数的结果，且输出是8.3f格式的实数(即输出的商占用8个字符长度，其中保留3位小数)，使用printf格式输出。输出格式如样例输出所示。
    }

    //定义2个成员变量，1个构造方法，4个实列方法
    public static void main(String[] args) {

        int Op1,Op2;
        //通过键盘录入连个操作数
        Scanner sc = new Scanner(System.in);
        Op1 = sc.nextInt();
        Op2 = sc.nextInt();
        Main lianxi=new Main(Op1,Op2);
        lianxi.addition();
        lianxi.subtraction();
        lianxi.multiplication();
        lianxi.division();

    }
}