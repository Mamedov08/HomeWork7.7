public class Magic extends Hero{


    public Magic(int hp, int damage) {
        super(hp, damage);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность ");
    }

    @Override
    public String info() {
        return super.info();
    }
}
