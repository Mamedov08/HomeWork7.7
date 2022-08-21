package com.company;

public class Warrior extends Hero{
    public Warrior(int health, int damage, String superpowertype) {
        super(health, damage, superpowertype);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");

    }
}
