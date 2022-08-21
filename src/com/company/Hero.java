package com.company;

public abstract class Hero implements HavingSuperAbility{
    public int health;
    public int damage;
    public String superpowertype;

    public Hero(int health, int damage, String superpowertype) {
        this.health = health;
        this.damage = damage;
        this.superpowertype = superpowertype;
    }

    @Override
    public void applySuperAbility() {

    }
}
