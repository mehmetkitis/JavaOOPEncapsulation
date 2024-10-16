package org.example;

public enum Weapon {
    SWORD(50,2.0),ARROW(75,4.0),GUN(90,5.0);

    private int damage;
    private double attackSpeed;

    private Weapon(int damage , double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage(){
        return this.damage;
    }

    public double getAttackSpeed(){
        return this.attackSpeed;
    }



}
