import java.time.LocalTime;
import java.util.Scanner;

public class Process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        long start;
        long endTime;
        long startTime;
        System.out.println("Press 1 then Enter to start: ");
        startTime = sc.nextLong();
        if(startTime==1){
           start = LocalTime.now().getSecond();
           watch.setStart(start);
        }
        System.out.println("Press 2 then Enter to stop: ");
         endTime = sc.nextLong();
         if( endTime ==2){
             watch.setEnd();
             System.out.println("Time passed : " + watch.getTime());
         }
    }
}
