import java.util.Scanner;
import java.util.Random;

public class Practice_3_6 {
    public static void main(String[] args){
        System.out.println("【数当てゲーム】");
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int ans = rnd.nextInt(10);

        for(int i = 0; i<5; i++){
            System.out.println("0~9の数字を入力して下さい。");
            int num = sc.nextInt();
            if(num == ans){
                System.out.println("アタリ!");
                break;
            } else {
                System.out.println("違います。");
            }
        }
        System.out.println("ゲームを終了します。");

    }
}