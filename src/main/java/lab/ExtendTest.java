package lab;

import model.User;
import model.UserDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ExtendTest {

    static List<User> users;
    static List<UserDetail> details;

    public static <K, V> Stream <K> mapToStream(Map<K, V> map) {
        return map.keySet().stream();
    }

    public static void testExtend(){
        System.out.println("test1 extend");

        UserDetail detailForTest = details.get(0);
        User user = detailForTest;
        System.out.println(user.getId());

        User user2 = new User();
        user2 = user;



    }


    public static void main(String args[]) {

        User user1 = new User();
        user1.setId("1");
        user1.setName("test1");
        User user2 = new User();
        user2.setId("2");
        user2.setName("test2");
        User user3 = new User();
        user3.setId("3");
        user3.setName("test3");

        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        UserDetail detail1 = new UserDetail();
        detail1.setId("d1");
        detail1.setName("testd1");
        detail1.setEmail("test1@test.com");
        UserDetail detail2 = new UserDetail();
        detail2.setId("d2");
        detail2.setName("testd2");
        detail2.setEmail("test2@test.com");

        details = new ArrayList<>();
        details.add(detail1);
        details.add(detail2);

//        users = details;
//        details = users;

//        List<UserDetail> targets = new ArrayList<>();
//        details.stream().forEach(detail -> targets.add(detail));
//        List<UserDetail> targets1 = new ArrayList<>();
//        users.stream().forEach(user -> targets1.add(user));

//        List<UserDetail> targets = new ArrayList<UserDetail>();
//        targets = getAllUsers();

        testExtend();


    }

    public static List<? extends  User> getAllUsers() {

        UserDetail detail1 = new UserDetail();
        detail1.setId("d1");
        detail1.setName("testd1");
        detail1.setEmail("test1@test.com");
        UserDetail detail2 = new UserDetail();
        detail2.setId("d2");
        detail2.setName("testd2");
        detail2.setEmail("test2@test.com");

        List<UserDetail> details = new ArrayList<>();
        details.add(detail1);
        details.add(detail2);

        return details;
    }

}

