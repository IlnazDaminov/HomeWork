package test4;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;

        Dog dog2 = (Dog)animal;
        dog2.say();


    }
}

//Upcasting and Downcasting восходящее и нисходящее преобраование
