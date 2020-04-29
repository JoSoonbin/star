public abstract class Unit {
    protected Unit(int hp, int attackCount)
    {
        this.hp = hp;
        this.attackCount = attackCount;
        speed = 3;
    }

    private int hp;
    private int attackCount;

    public int getHP() {
        return hp;
    }
    public int getAttackCount() {return attackCount;}

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
