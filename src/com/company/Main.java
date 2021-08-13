package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(50);
        boss.setBossHealth(100);
        boss.setBossDefence("Kinetic");
        System.out.println("Boss Damage-" + boss.getBossDamage() + " " + "Boss Health-" + boss.getBossHealth() + " " + "Boss Defence-" + boss.getBossDefence());

    }

    public static Hero[] createHeroes() {
        Hero Warrior = new Hero(250, 30, "Warrior");
        Hero Magical = new Hero(150, 20, "Magical");
        Hero Kinetic = new Hero(150, 25);
        Hero[] heroMassive = {Warrior, Magical, Kinetic};
        return heroMassive;
    }
}
