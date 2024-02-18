import java.util.Random;

public class Cleric {
    protected String name;
    protected int hp = 50;
    protected static final int maxHp = 50;
    protected int mp = 10;
    protected static final int maxMp =10;

    public Cleric(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Cleric(String name, int hp){
        this(name, hp, Cleric.maxMp);
    }

    public Cleric(String name){
        this(name, Cleric.maxHp);
    }

    public void selfAid(){
        if(this.mp>=5){
            this.hp = Cleric.maxHp;
        } 
    }

    public int pray(int seconds){
        int result = seconds;
        Random rand = new Random();
        result += rand.nextInt(3);
        if(this.mp+result>Cleric.maxMp){
            return Cleric.maxMp - this.mp;
        } else {
            return result;
        }
    }
}