import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Date now = new Date();

        Calendar c = Calendar.getInstance();

        c.setTime(now);

        int day = c.get(Calendar.DAY_OF_MONTH);

        day +=100;

        c.set(Calendar.DAY_OF_MONTH, day);

        Date date = c.getTime();

        SimpleDateFormat f = new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss");
        String s = f.format(date);

        System.out.println(s);

        Account ac_4649 = new Account("4649", 1592);
        System.out.println(ac_4649);
    }
}
