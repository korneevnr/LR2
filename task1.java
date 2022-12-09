import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Дата: ");
        String date = scanner.next();
        Matcher m = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/](19[9]\\d|[2-9][0-9]\\d\\d)").matcher(date);
        Matcher k = Pattern.compile("(\\d\\d)[/](\\d\\d)[/](\\d\\d\\d\\d)").matcher(date);
        String[] data = date.split("/");
        if(m.matches()) {
            int day = Integer.parseInt(data[0]);
            int month = Integer.parseInt(data[1]);
            int year = Integer.parseInt(data[2]);
            int mistakeCounter = 0;
            if((month == 4  || month == 6  || month == 9 || month == 11) && day == 31){
                System.out.println("Введенное выражение не является датой");
                mistakeCounter++;
            }
            if(month == 2){
                if(day > 29){
                    System.out.println("Введенное выражение не является датой");
                    mistakeCounter++;
                }
                if(((year % 100 == 0 && year % 400 !=0) || year % 4 != 0) && day == 29){
                    System.out.println("Введенное выражение не является датой");
                    mistakeCounter++;
                }
            }
            if(mistakeCounter == 0)
                System.out.println("Введенное выражение является датой");
        }else if(k.matches()) {
            System.out.println("Введенное выражение не является датой");
        }else
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
    }
}
