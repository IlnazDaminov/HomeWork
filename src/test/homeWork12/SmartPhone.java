package test.homeWork12;
import java.util.Scanner;

public class SmartPhone extends Phone {
    Scanner sc = new Scanner(System.in);
    public void func(){
        super.calculate(sc.nextInt(),sc.nextInt());
        super.takePhoto();
        super.call();
    }
}
