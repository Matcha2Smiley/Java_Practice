import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            throw new IOException("にゃー");
        } catch (IOException ex) {
            System.out.println("IOException 例外をcatchしました");
            System.out.println("--------スタックトレースここから--------");
            ex.printStackTrace();
            System.out.println("--------スタックトレースここまで--------");
        }

        String s = null;
        try{
            System.out.println(s.length());
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException 例外をcatchしました");
            System.out.println("--------スタックトレースここから--------");
            ex.printStackTrace();
            System.out.println("--------スタックトレースここまで--------");
        }
        
        
        try {
            int i = Integer.parseInt("三");
            System.out.println(i);
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException 例外をcatchしました");
            System.out.println("--------スタックトレースここから--------");
            ex.printStackTrace();
            System.out.println("--------スタックトレースここまで--------");
        }
        
        
    }
}
