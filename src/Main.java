import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите данные из строки ответ через пробел ( )");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();         // 55 00 15 07 02 1D 01 - 15 - 21 год
//        String answer = "55 00 15 07 1F 1D 01";       // просто строка для проверки, что бы не вводить все время заново.

//проверка на успешное чтение. 55 00 - значит, что ошибок от оборудования не поступало. Вывод соответствующей инфо.
        if (!answer.matches("55 00.*")) {
            System.out.println("\tПроверяю статус: ==> (!) (!) Что-то не так: \n\t-проверьте настройки в программе, \n\t-для надёжности получите № ФР и ФН");
        } else {
            System.out.println("\tПроверяю статус: ==> Ответ получен, всё исправно");

//разбиваем массив, нам нужны с 0 по 4
            String[] part = answer.split(" ");
            int one = Integer.parseInt(part[0]);
            int two = Integer.parseInt(part[1]);
            int year = Integer.parseInt(part[2],16);                            // год
            int mounth = Integer.parseInt(part[3],16);                         // мес
            int day = Integer.parseInt(part[4],16);                           // день

            System.out.println("\t===================================\n\tФН годен до: (дд/мм/гг) \n\t\t\t" + day + " : " + mounth + " : " + "20" + year);
        }
    }
}