public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    
    public void heal(Hero h){
        int basePoint = 10; //基本回復ポイント
        int recovPoint = (int) (basePoint*this.wand.getPower());

        h.setHp(h.getHp()+ recovPoint);
        System.out.println(h.getName()+"のHPを"+recovPoint+"回復した！");
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        if(hp>0){
            this.hp = hp;
        } else {
            this.hp = 0;
        }
        
    }

    public int getMp(){
        return this.mp;
    }

    public void setMp(int mp){
        if(mp>0){
            this.mp = mp;
        } else {
            throw new IllegalArgumentException("mpは0未満を指定できません。");
        }
        
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if(name!=null&&name.length()>=3){
            this.name = name;
        } else {
            throw new IllegalArgumentException("名前は3文字以上で指定してください。");
        }
        
    }

    public Wand getWand(){
        return this.wand;
    }

    public void setWand(Wand wand){
        if(wand!=null){
            this.wand = wand;
        } else {
            throw new IllegalArgumentException("魔法使いの杖にnullは許可されていません。");
        }
        
    }
}

