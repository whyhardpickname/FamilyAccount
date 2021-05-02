package homework.homework5v2;

/**
 * @author MarkChern
 */
public class Test {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();
        for (int i = 1; i <= 10; i++) {
            Thread t = new Thread(tunnel, "perspn" + i);
            t.start();
        }
    }
}
