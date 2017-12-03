package test.homeWork12;

public abstract class Phone implements Camera, Call, Calculator{

    @Override
    public void calculate(int a,int b) {
        System.out.println("I can calculate!" + " Sum"  + " = " + (a+b));
    }

    @Override
    public void call() {
        System.out.println("I can Call!");
    }

    @Override
    public void takePhoto() {
        System.out.println("I can take photo!");
    }
}
