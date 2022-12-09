import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пароль: ");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        Matcher m = Pattern.compile("(?=\\S*[0-9])(?=\\S*[a-z])(?=\\S*[A-Z])\\S{8,}").matcher(date);
        Matcher tester = Pattern.compile("(?=\\S*[@!#$%^&*()+=;:{},.?/-])\\S{1,}").matcher(date);
        if(m.matches() && !tester.matches())
            System.out.println("Пароль надежен");
        else
            System.out.println("Пароль ненадежен: попробуйте снова");
    }
}
