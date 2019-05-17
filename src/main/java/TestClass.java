import java.util.Optional;

public class TestClass {

    public static void main(String args[]) {
        System.out.println("test");

        User user = new User();
        Optional.ofNullable(user).orElse(new User());
    }

}
