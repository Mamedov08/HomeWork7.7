package com.company;

public class Medic extends Hero{
    private int healPoints;
    public int increaseExperience(){
        int percent = (((10 * healPoints) / 100) + healPoints);
        return healPoints + percent;
    }

    public Medic(int healPoints) {
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность ");
    }

    @Override
    public String info() {
        return super.info();
    }
}
