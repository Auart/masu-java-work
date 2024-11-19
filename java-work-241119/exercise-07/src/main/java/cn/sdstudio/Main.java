package cn.sdstudio;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String Ename = r.next();// 员工名
        String Mname = r.next();// 经理名
        double s = r.nextDouble();// 基本工资
        double b = r.nextDouble();// 奖金
        Employee e = new Employee(Ename, s);
        Manager m = new Manager(Mname, s, b);
        System.out.println("员工的姓名：" + e.getName() + "；员工的工资：" + e.getSalary());
        System.out.println("经理的姓名：" + m.getName() + "；员工的工资：" + m.getSalary());

    }
}
class Employee{
//在该类中定义了2个成员变量：name表示员工的姓名，salary表示员工的基本工资,定义一个构造方法为它们初始化，并分别为它们定义了get方法。
private String Name;
private double Salary;
public Employee(String Name, double Salary) {
    this.Name = Name;
    this.Salary = Salary;

}

public String getName() {
    return Name;
}
public double getSalary() {
    return Salary;
}
}
class Manager extends Employee{
    private double b;
    public Manager(String Name, double Salary,double b) {
        super(Name, Salary);
        this.b = b;
    }
//在该类中定义一个成员变量bonus，表示经理的奖金，并为其设置了get方法。重写getSalary()方法，经理的工资是基本工资和奖金之和。

    @Override
    public double getSalary() {
        return super.getSalary() + b;
    }
}


