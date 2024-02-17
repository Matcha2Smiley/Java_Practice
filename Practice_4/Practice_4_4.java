import java.util.Scanner;

public class Practice_4_4 {
    public static void main(String[]args){
        int[] numbers = {3, 4, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("1桁の数字を入力してください。");
        int input = sc.nextInt();
        for(int number:numbers){
            if(number==input){
                System.out.println("アタリ!");
            }
        }
        System.out.println("ゲームを終了します。");
    }
}