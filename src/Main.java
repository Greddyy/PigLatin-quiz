import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newString = "";
        String ay = "ay";
        String xr = "xr";
        String yt = "yt";
        String firstFourChars = "";

        System.out.println("Enter a string");
        String input = sc.nextLine();
        firstFourChars = input.substring(0, 2);
        char [] arr = input.toCharArray();

        if (symbols(arr[0]) || (firstFourChars.equals(xr)||firstFourChars.equals(yt))){
            newString = input + ay;
        }
        System.out.println(newString);

    }
    public static boolean symbols(char ch){
        ch = Character.toLowerCase(ch);
        return (ch=='a' || ch=='e'||ch=='o'||ch=='i'||
                ch=='y'||ch=='u');
    }
}
