package InnerClassEx;

import javax.sound.midi.Soundbank;

/**
 * @author MarkChern
 * date 2020/12/3 8:08
 */
public class DoctorTest
{
    public static void main(String[] args)
    {
        Body body1 = new Body("alice", 56, true);
        System.out.println(body1);

        Body body2 = new Body("bob", 65, false);
        System.out.println(body2);

        System.out.println();
        Doctor.swap(body1, body2);
        System.out.println(body1);
        System.out.println(body2);
    }
}
