public class Marine extends Unit implements Fastable{
    public Marine() {
        super(5);
        attackCount = marineAttackCount;
    }

    private int attackCount;
    public int getAttackCount() {return attackCount;}

    void useSteamPack(){
        speed *= 2;
    }

    @Override
    public void speedUp() {
        useSteamPack();
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    protected String getUnitName() {
        return "Marine";
    }
}
