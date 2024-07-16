package Creational.Prototype;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        User user = new User();
        user.setUserId("id");
        user.setUserName("name");
        user.setImportantData();

        System.out.println(user);

        User userClone = (User) user.clone();
        System.out.println(userClone);
        System.out.println('a' + "a");
        int s = 2;
        s = -s;
        System.out.println(s);
        Deque<Integer> deque = new ArrayDeque<>();

    }
}
