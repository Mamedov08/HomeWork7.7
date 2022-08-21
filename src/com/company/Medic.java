package com.company;

public class Medic extends Hero {
    public int healPoints;

    public Medic(int health, int damage, String superpowertype) {
        super(health, damage, superpowertype);
    }


    public String increaseExperience() {
        double percent = (((10 * healPoints) / 100) + healPoints);
            return "HealPoints: " + healPoints + " увеличивается на 10 % стало: " + percent;

        }
        @Override
    public void applySuperAbility() {
            System.out.println("Medic Health");
        }

        }


