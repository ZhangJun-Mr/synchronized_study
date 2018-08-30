package timer.timerTest1;

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

    public static void main(String[] args) {


    }
}
