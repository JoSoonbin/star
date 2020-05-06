public class Dragoon extends ProtossUnit{
    public Dragoon() {
        super(10, 3);
        attackCount = dragoonAttackCount;
    }
    private int attackCount;
    protected String getUnitName(){
        return "Dragoon";
    }
}
