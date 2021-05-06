package exercises;

/**
 * @author MarkChern
 * 案例：编写龟兔赛跑多线程程序，设赛跑长度为30米
 * 兔子的速度是10米每秒，兔子每跑完10米休眠的时间10秒
 * 乌龟的速度是1米每秒，乌龟每跑完10米的休眠时间是1秒
 * 要求，每跑1米，显示一下结果：xxx跑了几米，
 * 	  休息时，显示一下：xxx在休息...
 */
public class ex1 {
    public static void main(String[] args) throws InterruptedException {
        Sportman rabbit = new Sportman("兔子",100, 10000, 30);
        Sportman tortoise = new Sportman("乌龟",1000, 1000, 30);
        rabbit.start();
        tortoise.start();

        while (true) {
            if (rabbit.isFinished() || tortoise.isFinished()) {
                rabbit.interrupt();
                tortoise.interrupt();
                rabbit.setStopped(true);
                tortoise.setStopped(true);
                break;
            }
        }

        if (tortoise.isFinished()) {
            System.out.println(tortoise.getName() + "赢了");
        }
        else if (tortoise.isFinished() && rabbit.isFinished()) {
            System.out.println(rabbit.getName() + "和" + tortoise.getName() + "平局");
        }
        else {
            System.out.println(rabbit.getName() + "赢了");
        }
    }
}

class Sportman extends Thread {
    private long millsPerMeter; //米每秒
    private long restTime;//毫秒
    private long distance;//米
    private long totalTime;
    private volatile boolean finished;
    private boolean stopped;

    public Sportman(String name, long millsPerMeter, long restTime, long distance) {
        super(name);
        this.millsPerMeter = millsPerMeter;
        this.restTime = restTime;
        this.distance = distance;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        int i;
        for (i = 1; i <= distance && !stopped; i++) {
            try {
                sleep(millsPerMeter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + i + "米");
            if (i < distance && i % 10 == 0) {
                try {
                    System.out.println(getName() + "在休息");
                    sleep(restTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        totalTime = end - start;
        if (i >= distance) {
            finished = true;

        }
    }

    public long getTotalTime() {
        return totalTime;
    }

    public void setStopped(boolean stopped) {
        this.stopped = stopped;
    }

    public boolean isFinished() {
        return finished;
    }
}

