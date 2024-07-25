package org.example;

public class Point {
    // Private değişkenler
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter ve Setter metodları
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Overloaded distance metodları

    // (0,0) noktasına olan uzaklık
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Başka bir Point nesnesine olan uzaklık
    public double distance(Point p) {
        return Math.sqrt((p.getX() - this.x) * (p.getX() - this.x) + (p.getY() - this.y) * (p.getY() - this.y));
    }

    // Verilen koordinatlara olan uzaklık
    public double distance(int a, int b) {
        return Math.sqrt((a - this.x) * (a - this.x) + (b - this.y) * (b - this.y));
    }
}
