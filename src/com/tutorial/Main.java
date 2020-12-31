package com.tutorial;

class Player {

    private String name;
    private int baseHealth;
    private int baseAttack;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int incrementHealth;
    private int incrementAttack;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 20;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 7;
    }

    public void display() {
        System.out.println("\nPlayer: " + this.name);
        System.out.println("Levvel\t" + this.level);
        System.out.println("MaxHealth: " + this.maxHealth());
        System.out.println("Attack: " + this.getAttackPower());
    }

    public void levelUp() {
        this.level++;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddStrength();
    }

    public int getAttackPower() {
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }
}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }
}

class Armor {
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;

    }

    public int getAddStrength() {
        return this.strength * 10 + this.health;
    }

    public int getHealth() {
        return this.health;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        // objek 1
        Player player1 = new Player("Marni");
        Armor armor1 = new Armor("Baju besi", 5, 100);
        Weapon weapon1 = new Weapon("Pedang", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        // objek 2
        Player player2 = new Player("Siti Nurbaya");
        Armor armor2 = new Armor("Kebaya", 3, 40);
        Weapon weapon2 = new Weapon("Cambuk", 4);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();
        // player1.levelUp();

    }
}
