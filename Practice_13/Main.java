public class Main {
    public static void main(String[] args){
        Y[] Ys = new Y[2];

        Ys[0] = new A();
        Ys[1] = new B();

        for(int i=0; i< Ys.length;i++){
            Ys[i].b();
        }
    }
}
