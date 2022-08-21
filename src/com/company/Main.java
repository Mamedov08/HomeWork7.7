package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior(233, 432, "Сильная");
        Magic warri = new Magic(233, 432, "Сильная");
        Medic warr = new Medic(233, 432, "Сильная");
        Hero[] str = {warr, warri, warrior};

        for (Hero sr : str) {
            sr.applySuperAbility();
        }

        Hero[] hero = {
                warrior, warri, warr
        };
        for (int i = 0; i < hero.length; i++) {
            System.out.println(warr.increaseExperience() + " " + i);
        }
    }
}