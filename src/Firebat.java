public class Firebat extends Unit{
    public Firebat() {
        super(10);
        attackCount = firebatAttackCount;
    }

    private int attackCount;

    @Override
    protected String getUnitName() {
        return "Firebat";
    }
}
