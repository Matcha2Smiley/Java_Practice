public class Wand {
    private String name;
    private double power;

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

    public double getPower(){
        return this.power;
    }

    public void setPower(double power){
        if(power>=0.5&&power<=100.0){
            this.power = power;
        } else {
            throw new IllegalArgumentException("杖の魔力による増幅率は0.5~100.0の間で指定してください。");
        }
        
    }
}

