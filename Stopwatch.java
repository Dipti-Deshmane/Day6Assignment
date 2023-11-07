package Day6Assign;

import java.util.Scanner;

public class Stopwatch {
    private long startTime;
    private long endTime;
    private boolean running;

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to start the stopwatch.");
        scanner.nextLine();
        stopwatch.start();

        System.out.println("Press Enter again to stop the stopwatch.");
        scanner.nextLine();
        stopwatch.stop();

        long elapsedMilliseconds = stopwatch.getElapsedTime();
        System.out.println("Elapsed time: " + elapsedMilliseconds + " milliseconds");
    }

    public void start() {
        startTime = System.currentTimeMillis();
        running = true;
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        running = false;
    }

    public long getElapsedTime() {
        if (running) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }
}
