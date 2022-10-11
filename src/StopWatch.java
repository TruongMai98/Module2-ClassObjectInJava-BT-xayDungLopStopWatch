import java.time.LocalTime;
import java.util.Date;
public class StopWatch {
    private Date startTime, endTime;

    public StopWatch() {
    }

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = new Date();
    }

    public void stop() {
        endTime = new Date();
    }

    public long getElapsedTime() {
        long miliSecond = endTime.getTime() - startTime.getTime();

        return miliSecond;
    }
}