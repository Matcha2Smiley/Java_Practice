import java.lang.Math;

public class Practice_5 {
    public static void main(String[] args){
        introduceOneself();
        System.out.println("-------------------------------------");
        email("Re:お菓子について", "hogehoge@hoge.com", "揚げ餅は美味しい");
        email("hogehoge@hoge.com", "件名なしで送ってみよう");
        double tri = calcTriangleArea(23.4,45.6);
        System.out.println("三角形:"+tri);
        double circle = calcCirclrArea(12.3);
        System.out.println("円:"+circle);
    }

    public static void introduceOneself(){
        String name = "AAA";
        int age = 23;
        double height = 175.5;
        char sex = 'm';

        System.out.println("名前:" + name + "\n" + "年齢:" + age + "\n" + "身長:" + height + "\n" + "性別:" + sex);
    }

    public static void email(String title, String address, String text){
        System.out.println("「"+ address +"」に、以下のメールを送信しました");
        System.out.println("件名:"+title);
        System.out.println("本文:"+text);
    }

    public static void email(String address, String text){
        System.out.println("「"+ address +"」に、以下のメールを送信しました");
        System.out.println("件名:無題");
        System.out.println("本文:"+text);
    }

    public static double calcTriangleArea(double bottom, double height){
        return bottom*height/2;
    }

    public static double calcCirclrArea(double radius){
        return Math.round(radius*2*Math.PI);
    }

}