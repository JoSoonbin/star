public class Zealot extends ProtossUnit implements Fastable {
    public Zealot() {
        super(5, 3);
        attackCount = zealotAttackCount;
    }

    private int attackCount;

    public void balup() {
        speed += 3;
    }

    @Override
    public void speedUp() {
        balup();
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String getStatus() {
        return "[Zealot] HP:" + getHP() + ", Shield:" + getShield();
    }

    protected String getUnitName(){
        return "Zealot";
    }
}
