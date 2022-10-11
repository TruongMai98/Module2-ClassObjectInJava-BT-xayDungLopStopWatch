import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();


        StopWatch newStopWatch = new StopWatch();
        System.out.println("thoi gian bat dau");
        newStopWatch.start();
        System.out.println(newStopWatch.getStartTime());
        for (int i = 0; i < 100000000; i++) {
            System.out.print("");
        }
        System.out.println("thoi gian ket thuc");
        newStopWatch.stop();
        System.out.println(newStopWatch.getEndTime());

        System.out.println("thoi gian da troi qua");
        System.out.println(newStopWatch.getElapsedTime());
    }
}
