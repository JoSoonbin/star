public abstract class Unit {
    protected Unit(int hp)
    {
        this.hp = hp;
        speed = 3;
    }

    private int hp;
    protected static int marineAttackCount = 4;
    protected static int firebatAttackCount = 2;
    protected static int zealotAttackCount = 3;
    protected static int dragoonAttackCount = 2;

    public int getHP() {
        return hp;
    }
    public int getAttackCount() {return marineAttackCount;}

    public void getDamaged(int damage){
        while (damage > 0 && hp > 0){
            damage--;
            hp--;
        }
    }

    protected int speed;

    protected String getUnitName(){
        return "John Doe";
    }

    public String getStatus(){
        return getUnitName() +  " HP:" + getHP();
    }

    public void recovery(int point) {
        hp += point;
        System.out.println("(recovery) hp: " + hp);
    }
}
