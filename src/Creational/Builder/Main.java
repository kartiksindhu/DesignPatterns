package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder().setEmail("email").setId("id").setName("name").build();
        System.out.println(user.getEmail());
        System.out.println(user.getId());
        System.out.println(user.getName());
    }
}
