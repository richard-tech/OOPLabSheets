package labsheet1;

import java.sql.SQLOutput;

public class Account {

    String name;
    int age;

    public static void main(String[] args) {

        Account a = new Account();

        a.setName("Richard");
        a.setAge(33);

     a.printDetails();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails(){
        System.out.println(name + "," + age);
    }

}
