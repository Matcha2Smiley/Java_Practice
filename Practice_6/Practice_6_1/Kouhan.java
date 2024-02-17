package comment;

public class Kouhan {
    public static void doC(){
        System.out.println("C");
    }

    public static void doD() throws Exception{
        System.out.println("D");
        Thread.sleep(3000);
        Zenhan.doA();
    }
}

