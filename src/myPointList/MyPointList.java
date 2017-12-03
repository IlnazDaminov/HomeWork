package myPointList;


import task43.src.Point;

public class MyPointList {
    private Point[] points;
    private int size;

    public MyPointList() {
        points = new Point[5];
        size = 0;
    }

    public int add(Point point) {
        if (size == points.length) {
            Point[] buf = points;
            points = new Point [buf.length*2];
            System.arraycopy(buf,0, points,0, buf.length);
        }
        points[size] = point;
        size++;
        return size;
    }

    public int getSize() {
        return size;
    }

    public boolean remove(int i) {
        size --;
        for (int j = i; j < size; j++) {
            points[i] = points[i+1];
        }
        points[size] = null;
        return true;
    }

    public Point get(int j) {

        return points[j];
    }

    public int indexOf(Point point){
        for (int i = 0; i < size; i++) {
            if(point.equals(points[i])){
                return i;
            }
        }
        return -1;
    }
}
