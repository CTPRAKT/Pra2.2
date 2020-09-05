package com.company;

public class Ball {
    private double x=0.0;
    private double y=0.0;

    public Ball(int i, int i1) {
        this.x=i;
        this.y=i1;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void move(double xd,double yd){
        this.x=x+xd;
        this.y=y+yd;
    }
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
