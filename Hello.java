import java.util.Scanner;
public class Hello{
    //Comment required by Lab06
    public static void main(String[] args){
        //Scanner set up to take user input
        Scanner scnr = new Scanner(System.in);

        System.out.println("Hello. What is your name? ");
        String name = scnr.next();//stores the name of person
        System.out.println("It's nice to meet you, " + name + ". How old are you? ");
        String age = scnr.next();//stores the age of the person
        System.out.println("I see that you are still quite young at only " + age + ". ");
        System.out.println("Where do you live? ");
        String location= scnr.next();//stores the place where the person lives
        System.out.println("Wow! I've always wanted to go to " + location + ". Thanks for chatting with me. Bye!");
    }//main
}// Hello class