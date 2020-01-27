package lab;

import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {

    static List<User> testList1;
    static List<User> testList2;
    static List<User> testList3;

    public static void main(String args[]){
        setup();

        System.out.println("test1 --------- (변경전) ");
        testList1.stream().forEach(o1->System.out.println(o1.getId()));

        System.out.println("레퍼런스 없는 익명 클래스 생성 ---------");
        testList1.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.getId().compareTo(o2.getId());
                    }
                }
        );
        testList1.stream().forEach(o1->System.out.println(o1.getId()));
        System.out.println();
        System.out.println("test2--------- (변경전) ");
        testList2.stream().forEach(o1->System.out.println(o1.getId()));

        System.out.println("Lambda 표현식으로 변환");
        System.out.println("해당클래스가 메서드를 한개만 갖고 있다면 함수 형식을 이용해 어떤 객체의 어떤 메서드가 호출되는지 알 수 있다.");
        testList2.sort(
                (User1, User2) -> {
                    return User1.getId().compareTo(User2.getId());
                });
        testList2.stream().forEach(o1->System.out.println(o1.getId()));
    }

    static void setup(){
        User c1 = new User();
        c1.setId("test1");
        User c2 = new User();
        c2.setId("test5");
        User c3 = new User();
        c3.setId("test3");
        List<User> UserList = new ArrayList<>();
        UserList.add(c1);
        UserList.add(c2);
        UserList.add(c3);

        testList1 = new ArrayList<>();
        testList2 = new ArrayList<>();
        testList3 = new ArrayList<>();
        testList1.addAll(UserList);
        testList2.addAll(UserList);
        testList3.addAll(UserList);
    }
}

