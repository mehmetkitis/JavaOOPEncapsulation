package org.example;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        Point point1 = new Point(5,6);
        System.out.println(point.distance());
        System.out.println(point.distance(7,8));
        System.out.println(point.distance(point1));
        System.out.println("---------------------------------");
        //Player player = new Player("mehmet",100,Weapon.SWORD);
        //System.out.println(player.healthRemaining());
        //System.out.println(player.loseHealth(120));
        //System.out.println(player.restoreHealth(120));
    }
}