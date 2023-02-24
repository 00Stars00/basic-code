import java.util.Scanner;

public class Main {

    private int hour;
    private int minute;
    public static void main(String[] args) {
        // 然后是几点
        Scanner scanner = new Scanner(System.in);
        Main time = new Main();
        Main minute = new Main();
        time.setTime(scanner.nextInt());
        minute.steMinute(scanner.nextInt());
        time = time.getTime(time,minute);
        if(time.minute == 0)
            System.out.print(time.hour + "0" + time.minute);
        else {
            System.out.print(time.hour + "" + time.minute);
        }
    }

    public void setTime(int t) {
        hour = t/100;
        minute = t%100;
    }
    public void steMinute(int m) {
        hour=m/60;
        minute=m%60;
    }
    public Main getTime(Main t, Main m){
        Main time = new Main();
        if (t.minute + m.minute >= 60) {
            time.hour = t.hour + m.hour + 1;
            time.minute = t.minute + m.minute - 60;
        } else if (t.minute + m.minute < 0) {
            time.hour = t.hour + m.hour - 1;
            time.minute = t.minute + m.minute + 60;
        } else {
            time.hour = t.hour + m.hour;
            time.minute = t.minute + m.minute;
        }
        while (time.hour >= 24) {
            time.hour -= 24;
        }
        while (time.hour < 0) {
            time.hour += 24;
        }
        return time;
    }
}
