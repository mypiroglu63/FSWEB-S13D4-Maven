package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());


        System.out.println("Hello world!");

        Player player1 = new Player("John", 120, Weapon.SWORD);
        System.out.println(player1.healthRemaining());

        player1.loseHealth(30);
        System.out.println(player1.healthRemaining());

        player1.restoreHealth(50);
        System.out.println(player1.healthRemaining());

        player1.loseHealth(150);
        System.out.println(player1.healthRemaining());
    }
}

