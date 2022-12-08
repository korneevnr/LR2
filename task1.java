import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дата: ");
        String date = scanner.next();
        Matcher m = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19[9]\\d|[2-9][0-9]\\d\\d)").matcher(date);
        Matcher d = Pattern.compile("(3[2-9]|[4-9][0-9])[/](1[3-9]|[2-9][0-9])[/](\\d\\d\\d\\d)").matcher(date);
        Matcher k = Pattern.compile("(\\d\\d)[/](\\d\\d)[/](\\d\\d\\d\\d)").matcher(date);
        if(m.matches())
            System.out.println("Введенное выражение является датой");
        else if(d.matches() || k.matches())
            System.out.println("Введенное выражение не является датой");
        else
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
    }
}
