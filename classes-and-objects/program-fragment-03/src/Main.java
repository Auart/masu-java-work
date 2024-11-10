import java.util.Scanner;

/**
 * Description: TODO
 *
 * @author auart
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        //键盘录入速度和容量
         int speed= r.nextInt();
        int amount= r.nextInt();
        CPU cpu = new CPU();
        cpu.setSpeed(speed);
        HardDisk disk = new HardDisk();
        disk.setAmount(amount);
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}
class CPU{
    //CPU类有int型speed成员变量，提供getSpeed()方法返回speed的值；setSpeed(int m)方法设置speed的值。
    private int speed;
    private int amount;
    public CPU(){

    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }


}
class HardDisk{
    //HardDisk类有int型amount成员变量，提供getAmount()方法返回amount的值，setAmount((int m)方法设置amount的值。
    private int amount;
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return amount;
    }

}
class PC{
    //PC类组合CPU和HardDisk类的对象，PC类提供setCPU(CPU c)方法和setHardDisk(HardDisk h)方法。PC类有show（）方法可以输出CPU的速度和HD的容量。
    private CPU cpu;
    private HardDisk hardDisk;
    public void setCPU(CPU cpu){
        this.cpu = cpu;

    }
    public void setHardDisk(HardDisk hardDisk){
        this.hardDisk = hardDisk;
    }

    public void show(){
        System.out.println(cpu);
        System.out.println(hardDisk);
    }

}
