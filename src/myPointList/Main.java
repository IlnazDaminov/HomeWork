package myPointList;


import task43.src.Point;

public class Main {
    public static void main(String[] args) {
        MyPointList list = new MyPointList();
        for (int i = 0; i < 15; i++) {
            list.add(new Point(i,i));
        }
        System.out.println(list.get(0).getX());
        System.out.println(list.get(1).getX());
        System.out.println(list.get(2).getX());
        System.out.println(list.get(3).getX());
        System.out.println(list.get(4).getX());
        System.out.println(list.getSize());
        list.remove(2);
        System.out.println(list.get(2).getX());
        System.out.println(list.getSize());

        System.out.println(list.indexOf(new Point(13,13)));
    }
}
