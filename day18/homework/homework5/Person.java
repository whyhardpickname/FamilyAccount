package homework.homework5;

/**
 * @author MarkChern
 */
public class Person extends Thread{
    private Cave cave;

    public Person(String name, Cave cave) {
        super(name);
        this.cave = cave;
    }

    @Override
    public void run() {
        synchronized (cave) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cave.setCounter(cave.getCounter() + 1);
            System.out.println(Thread.currentThread().getName() + ", 第" + cave.getCounter() + "个通过");
        }
    }
}
