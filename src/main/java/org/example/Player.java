package org.example;

public class Player {
    private String name ;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name , int healthPercentage , Weapon weapon){
        this.name = name;
        this.healthPercentage = healthPercentage<0 ? 0 : (healthPercentage>100 ? 100 : healthPercentage);
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return this.healthPercentage;
    }

    public int loseHealth(int damage){
        if((this.healthPercentage-damage)<=0 ){
            this.healthPercentage = 0;
            System.out.println(this.name + " player has been knocked out of game");
            return this.healthPercentage;
        }
        this.healthPercentage = this.healthPercentage-damage;
        return this.healthPercentage;
    }

    public int restoreHealth(int healthPotion){
        if((this.healthPercentage+healthPotion)>100 ){
            this.healthPercentage = 100;
            return this.healthPercentage;
        }
        this.healthPercentage=this.healthPercentage + healthPotion;
        return this.healthPercentage;
    }
}
