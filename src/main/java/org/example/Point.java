package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int setX(int x){
        return x;
    }

    public int setY(int y){
        return y;
    }

    public double distance(){
        double c = Double.valueOf(this.x);
        double d = Double.valueOf(this.y);
        return Math.sqrt((c-0)*(c-0) + (d-0)*(d-0));
    }

    public double distance(int a , int b){
        double c = Double.valueOf(this.x);
        double d = Double.valueOf(this.y);
        double e = Double.valueOf(a);
        double f = Double.valueOf(b);
        return Math.sqrt((c-e)*(c-e) + (d-f)*(d-f));
    }

    public double distance(Point point){
        double c = Double.valueOf(this.x);
        double d = Double.valueOf(this.y);
        double e = Double.valueOf(point.getX());
        double f = Double.valueOf(point.getY());
        return Math.sqrt((c-e)*(c-e) + (d-f)*(d-f));
    }


}
