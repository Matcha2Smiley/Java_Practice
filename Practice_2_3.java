import java.util.Scanner;
import java.util.Random;

public class Practice_2_3 {
    public static void main(String[] args){
        System.out.println("ようこそ占いの館へ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("あなたの名前を入力して下さい:");
        String name = scanner.next();
        System.out.print("あなたの年齢を入力して下さい:");
        String ageString = scanner.next();
        Random rnd = new Random();
        int fortune = rnd.nextInt(4);
        fortune ++;
        System.out.println(ageString+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
        System.out.println("1:大吉, 2:中吉, 3:吉, 4:凶");
    }
}