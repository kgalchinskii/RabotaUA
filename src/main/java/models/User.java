package models;

public class User {

    public String login = "user";
    public String password = "1234";

    public String name = "Bob";
    public int age = 30;
    public long phoneNumber = 380507222599L;

    public void showUserData() {
        System.out.println(String.format("Login: %s.", login));
        System.out.printf("Password: %s.", password);
        System.out.println("Name: " + name + ".");
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
    }

    public void increaseAge(int value) {
        age += value;
    }

}
