package day14homework.ex5;

/**
 * @author MarkChern
 * date 2020/12/10 8:14
 */

@Table(value = "t_user")
public class User
{
    @Column(name = "No.", type = "int")
    private int id;

    @Column(name = "username", type = "varchar(20)")
    private String username;

    @Column(name = "pwd", type = "char(6)")
    private String password;

    @Column(name = "email", type = "varchar(50)")
    private String email;

}
