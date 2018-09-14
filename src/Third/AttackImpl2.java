package Third;

public class AttackImpl2 implements Attack {

    String attack;

    public AttackImpl2(String attack) {
        this.attack = attack;
    }

    @Override
    public void attack() {
        System.out.println(attack +" and "+ attack);
    }
}
