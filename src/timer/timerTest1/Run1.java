package timer.timerTest1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class Run1 {
    public static Timer timer = new Timer();
    public static class MyTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("running! times is: " + new Date());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask task = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateRef = sdf.parse("2018-08-31 08:49:00");
        System.out.println("字符串时间："+dateRef.toLocaleString());
    }
}
