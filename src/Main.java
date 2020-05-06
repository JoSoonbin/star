import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Unit m1 = new Marine();
        Unit f1 = new Firebat();
        Zealot z1 = new Zealot();

        attackSeveralTimes(f1, z1);
//        attackSeveralTimes(f1, m1);
    }

    private static void attackSeveralTimes(Unit attacker, Unit defender) {
        Random random = new Random();

        System.out.println(attacker.getUnitName()+" 공격횟수: "+ attacker.getAttackCount());
        System.out.println(defender.getUnitName()+"HP: "+ defender.getHP());

        int initialHP = defender.getHP();

        for (int i = 0; i < attacker.getAttackCount(); i++) {
            int attackPoint = random.nextInt(4) + 1;
            defender.getDamaged(attackPoint);

            System.out.println("[attacker] AP: " + attackPoint + " -> [defender]" + defender.getStatus());

            if (defender.getHP() <= 0) {
                System.out.println("dead");
                break;
            } else {
                if(defender.getHP() <= (initialHP / 2))
                    defender.recovery(attackPoint);
            }
        }
    }

    private static void getDamagedSeveralTimes(Unit unit, int times) {
        Random random = new Random();

        for (int i = 0; i < times; i++) {
            int damage = random.nextInt(3) + 1;
            System.out.print("[D]" + damage + " -> ");
            unit.getDamaged(damage);

            if (unit.getHP() == 0) {
                System.out.println("dead");
                break;
            } else {
                System.out.println(unit.getStatus());
            }
        }
    }

    private static void makeItFaster(Fastable fastable, int times){
        for (int i = 0; i < times; i++) {
            fastable.speedUp();
            System.out.println("[S]" + fastable.getSpeed());
        }
    }
}
