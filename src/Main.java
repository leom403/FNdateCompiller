import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите данные из строки ответ через пробел ( )");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
        //String answer = "55 00 15 07 1F 1D 01";       // просто строка для проверки, что бы не вводить все время заново.

//разбиваем массив 0-1 - ответ устрйотсва. 2,3,4 - дата
                String[] part = answer.split(" ");
                int one = Integer.parseInt(part[0]);
                int two = Integer.parseInt(part[1]);
                int year = Integer.parseInt(part[2], 16);                            // год
                int mounth = Integer.parseInt(part[3], 16);                         // мес
                int day = Integer.parseInt(part[4], 16);                           // день
                LocalDate localDate = LocalDate.of( day, mounth, year);
                String formattedDate = localDate.format(DateTimeFormatter.ofPattern("yy-MM-dd"));   //почему-то нужно указывать дату зеркально :/


//проверка на успешное чтение. 55 00 - значит, что ошибок от оборудования не поступало. Вывод соответствующей инфо.
//Проверка перенесена дальше, что бы в дальнейшем выйти на ошибки, если будет необходимость.
                if (one != 55 || two != 00) {
                    System.out.println("\tПроверяю статус: ==> (!) (!) Что-то не так. Ответ от устройства: " + part[0] + " " + part[1] +  "\n\t-проверьте настройки в программе, \n\t-для надёжности получите № ФР и ФН");
                } else {
                System.out.println("\tПроверяю статус: ==> Ответ получен, всё исправно\n\t===================================\n\tФН годен до: " + formattedDate + "\n\t\t\t\t(дд-мм-гг)\n");
                }
        }
    }
}