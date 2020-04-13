import java.time.LocalTime;

public class StopWatch {
    long startTime;
    public StopWatch(){};
    public long setStart(long start){
        return this.startTime = start;
    }
    public long setEnd(){
        return LocalTime.now().getSecond();
    }
    public long getTime(){
        return this.setEnd() - this.startTime;
    }
}
