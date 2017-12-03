package test.CatDove;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cat cat = new Cat(sc.nextInt(), sc.nextInt());
        Dove dove = new Dove(sc.nextInt(), sc.nextInt());

        if(cat.reaction > dove.reaction){
            cat.eat();
            System.out.print("Cat foodLevel = ");
            System.out.println(cat.foodLevel += dove.foodLevel);
        }
        else {
            dove.fly();
        }

    }
}
