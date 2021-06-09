import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {

        System.out.println("Enter your name");
        Scanner name = new Scanner(System.in);
        String Name = name.nextLine();
        System.out.println("Enter your Age");
        Scanner age = new Scanner(System.in);
        String Age = age.nextLine();
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);

    }
}