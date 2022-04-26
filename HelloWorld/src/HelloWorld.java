import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String name;
        String surname;
        int studentID;

        System.out.print("Please enter your first name: ");
        name = keyboard.nextLine();
        System.out.print("Please Enter your surname: ");
        surname = keyboard.nextLine();
        System.out.print("Please enter your student ID: ");
        studentID = keyboard.nextInt();

        System.out.println("Hello world. My name is " + name + " " + surname + " " + studentID);
    }
}
