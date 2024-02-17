import java.util.Random;

public class Cleric {
    protected String name;
    protected int hp = 50;
    protected final int maxHp = 50;
    protected int mp = 10;
    protected final int maxMp =10;

    public void selfAid(){
        if(this.mp>=5){
            this.hp = this.maxHp;
        } 
    }

    public int pray(int seconds){
        int result = seconds;
        Random rand = new Random();
        result += rand.nextInt(3);
        if(this.mp+result>this.maxMp){
            return this.maxMp - this.mp;
        } else {
            return result;
        }
    }
}