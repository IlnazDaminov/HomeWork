package com;

public class Cat {

    public int age;
    public String breed;
    public String name;

    public static void say(String say){

        System.out.println("Myau!" + say);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (breed != null ? !breed.equals(cat.breed) : cat.breed != null) return false;
        return name != null ? name.equals(cat.name) : cat.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (breed != null ? breed.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
