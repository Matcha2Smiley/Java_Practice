public class Hero {
    private int hp;
    private String name;
    private Sword sword;
    static int money;

    public int getHp(){
        return hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Sword getSword(){
        return this.sword;
    }

    public void setSword(Sword sword){
        this.sword = sword;
    }


    public void bye(){
        System.out.println("勇者は別れを告げた。");
    }

    public void die(){
        System.out.println(this.name+"は死んでしまった！");
        System.out.println("GAME OVERです。");
    }

    public void sleep(){
        this.hp = 100;
        System.out.println(this.name+"は眠って回復した。");
    }
}
