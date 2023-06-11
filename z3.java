//В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
import java.time.LocalTime;
import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        String Welcome = "";
        System.out.print("Введите Ваше имя: ");
        Scanner skanner = new Scanner(System.in);
        String username = skanner.next();
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(LocalTime.parse("05:00"))) Welcome = "Доброе утро, ";
        if (currentTime.isAfter(LocalTime.parse("12:00"))) Welcome = "Добрый день, ";
        if (currentTime.isAfter(LocalTime.parse("18:00"))) Welcome = "Добрый вечер, ";
        if (currentTime.isAfter(LocalTime.parse("23:00"))) Welcome = "Доброй ночи, ";
        System.out.println(Welcome + username + "!");
        skanner.close();
    }
}