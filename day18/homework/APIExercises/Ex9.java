package homework.APIExercises;

import javax.xml.transform.Source;
import java.util.Scanner;

/**
 * @author MarkChern
 */
public class Ex9 {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("jack", "1234");
        users[1] = new User("rose", "5678");
        users[2] = new User("tom", "000");

        Scanner in = new Scanner(System.in);
        System.out.print("账号：");
        String account = in.nextLine();
        System.out.print("密码：");
        String password = in.nextLine();
        login(new User(account, password), users);



    }

    public static void login(User user, User[] users) {
        for (User u : users) {
            if (u.getAccount().equals(user.getAccount())) {
                if (u.getPassword().equals(user.getPassword())) {
                    System.out.println("成功登录");
                    return;
                }
                else {
                    System.out.println("密码有误");
                    return;
                }
            }
        }
        System.out.println("用户名错误，没有该用户");
    }
}

class User {
    private String account;
    private String password;

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}