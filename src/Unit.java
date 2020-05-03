public abstract class Unit {
    protected Unit(int hp)
    {
        this.hp = hp;
        speed = 3;
    }

    private int hp;
    protected static int marineAttackCount = 4;
    private static int FirebatAttackCount = 2;
    private static int ZealotAttackCount = 3;
    private static int DragoonAttackCount = 2;

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
        System.out.println("!recovery:" + hp);
    }
}
