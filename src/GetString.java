import java.util.Scanner;

public class GetString {

    Scanner scanner = new Scanner(System.in);
//    String answer = scanner.nextLine();         // 55 00 15 07 02 1D 01 - 15 - 21 год
      String answer = "55 00 15 07 1F 1D 01";       // просто строка для проверки, что бы не вводить все время заново.

    //разбиваем массив, нам нужны с 0 по 4
    String[] part = answer.split(" ");
    int one = Integer.parseInt(part[0]);
    int two = Integer.parseInt(part[1]);
    String year = part[2];                            // год
    String mounth = part[3];                         // мес
    String day = part[4];                           // день


}