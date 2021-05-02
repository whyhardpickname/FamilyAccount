package homework.homework5;

/**
 * @author MarkChern
 */
public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        Cave cave = new Cave();
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("" + (i+ 1), cave);
        }

        for (int i = 0; i < people.length; i++) {
            people[i].start();
        }
    }
}
