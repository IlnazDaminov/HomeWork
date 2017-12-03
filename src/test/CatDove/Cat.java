package test.CatDove;

public class Cat extends Animal {
    public Cat(int m, int n) {
        this.reaction = m;
        this.foodLevel = n;
    }
    public void eat(){
        System.out.println("this Cat aet this Dove");
    }
}
