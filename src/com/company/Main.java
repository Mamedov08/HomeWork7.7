import com.company.Medic;

public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic(324);
        Magic magic = new Magic(600, 40);
        Warrior warrior = new Warrior(500, 50);

        Hero[] hero = {
                medic, warrior, magic
        };
        for (int i = 0; i < hero.length; i++) {
            System.out.println(hero[i].info());
            hero[i].applySuperAbility();
            if (hero[i] == medic) {
                System.out.println(medic.increaseExperience());

            }
        }
    }
}