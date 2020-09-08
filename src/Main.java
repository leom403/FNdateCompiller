import java.util.Scanner;
import java.lang.Object;
/*
Для перевода из 16 в 10 нужно:
каждая 10 часть - это 16 в степени, ачиная с 0. 921 = 1*16^0= 1; 2*16^1=2*16; 9*16^2 = 9*256;
потом все эти числа складываются между собой ( 1 + 32 + 2304 )
 */

public class Main {
    public static void main(String[] args) {

        String answerOK = "Ответ получен, всё исправно";

        System.out.println("Введите данные из строки ответ через пробел ( )");
        Scanner scanner = new Scanner(System.in);
//        String answer = scanner.nextLine();         // 55 00 15 07 02 1D 01 - 15 - 21 год
        String answer = "55 00 15 07 02 1D 01";       // просто строка для проверки, что бы не вводить все время заново.

//разбиваем массив, нам нужны с 0 по 4
        String[] part = answer.split(" ");
        Integer one = Integer.parseInt(part[0]);
        Integer two = Integer.parseInt(part[1]);
        Integer three = Integer.parseInt(part[2]);
        Integer four = Integer.parseInt(part[3]);
        Integer five = Integer.parseInt(part[4]);

//проверка на успешное чтение. 55 00 - значит, что ошибок от оборудования не поступало. Вывод соответствующей инфо.
        if (one == 55 && two == 00) {
            answerOK = answerOK;
        }
// вводим breakThePart, которой бьем массив [2](three), что бы получить 2 числа и произввести вычисления
        int breakThePart3;
//year
            while (three > 0) {
                breakThePart3 = three % 10;
                three /=10;
                System.out.println(breakThePart3);
             }
//нужно записать обе числа из получившегося breakThePart в массив.
//      breakThePart3 - год,        breakThePart2 - мес,        breakThePart1 - день,
//В новом вычислении partOne = part[0] * 1 ; partTwo = part[1] * 16
//далее year = partOne + partTwo
        System.out.println(answerOK + " \nФН годен до: (дд/мм/гг) \n\t\t\t" + day + " : "  + " : " + mounth + " : " + "20"+ year);
    }
}
