

import java.util.Scanner;
/**
 * Description: TODO
 *
 * @author auart
 */

public  class Main{

    public static void main(String[] args)  {
        Student[] s=new Student[5];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < s.length; i++) {

            s[i] = new Student();

            String[] s1 = sc.nextLine().split(" ");
            s[i].setsName(s1[0]);
            s[i].setsJava(Double.parseDouble(s1[1]));

        }
        double scoreCount = 0;
        for (int i = 0; i <s.length; i++) {
            scoreCount= scoreCount + s[i].getsJava();

        }

        double avg=scoreCount/s.length;

        for (int i = 0; i < s.length-1; i++) {
            for (int j = i; j < s.length-i-1; j++) {
                if(s[j].getsJava()>s[j+1].getsJava()){
                    double temp=0;
                    temp=s[j+1].getsJava();
                    s[j+1].setsJava(s[j].getsJava());
                    s[j].setsJava(temp);
                }
            }
        }

        System.out.printf("5位学生的最高分、最低分和平均分是：\n"+

                "最高分学生信息：%s,Java课成绩%f\n"+

                "最低分学生信息：%s,Java课成绩%f\n"+

                "5个同学的平均成绩是:%f\n",  s[s.length-1].getsName(), s[s.length-1].getsJava(), s[0].getsName(),s[0].getsJava(),avg);
    }
}

class Student {
    private String sName;
    private double sJava;

    public Student() {
    }

    public Student(String sName, double sJava) {
        this.sName = sName;
        this.sJava = sJava;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getsJava() {
        return sJava;
    }

    public void setsJava(double sJava) {
        this.sJava = sJava;
    }

}

