import java.util.Scanner;
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
        String answer = "55 00 1C 07 1F 1D 01";       // просто строка для проверки, что бы не вводить все время заново.

//разбиваем массив, нам нужны с 0 по 4
        String[] part = answer.split(" ");
        int one = Integer.parseInt(part[0]);
        int two = Integer.parseInt(part[1]);
        String three = part[2];                    // год
        int four;  // мес
        String five = part[4];                     // день

//проверка на успешное чтение. 55 00 - значит, что ошибок от оборудования не поступало. Вывод соответствующей инфо.
        if (one == 55 && two == 0) {
            answerOK = answerOK;
        }
// вводим breakThePart, которой бьем массив [2](three), что бы получить 2 числа и произввести вычисления
//нужно записать обе числа из получившегося breakThePart в массив.
//      breakThePart3 - год,        breakThePart2 - мес,        breakThePart1 - день,
//В новом вычислении partOne = part[0] * 1 ; partTwo = part[1] * 16
//далее year = partOne + partTwo
//ри переводе чисел, следует помнить, что в шестнадцатеричной системе счисления: A=10; B=11; C=12; D=13; E=14; F=15.
//Мне нужны числа до 12 в мес и до 31 в днях

//// Преобразование шестнадцатеричного символа в десятичное число
//        unsigned int char2int_(char chr)
//        {
//            if (chr >= '0' && chr <= '9')
//                return chr - '0';
//            else if (chr >= 'A' && chr <= 'F')
//                return chr - 'A' + 10;
//            else if (chr >= 'a' && chr <= 'f')
//                return chr - 'a' + 10;
//            return -1;
//        }
//**************
//
//Java's Integer class has a built-in method to parse a hex number (string) into an int:
//
//Integer.valueOf("AB", 16)
// 26-1A; 27-1B;28-1C;29-1D;30-1E;31-1F
        switch (five){
                case ("1A"):
                    five= "26";
                    break;
            case ("1B"):
                five = "27";
                break;
            case  ("1C"):
                five = "28";
                break;
            case  ("1D"):
                five = "29";
                break;
            case ("1E"):
                five = "30";
                break;
            case ("1F"):
                five = "31";
                break;
            }
//блок свичка года, хватит до 2035
        switch (three){
            case ("1A"):
                three= "26";
                break;
            case ("1B"):
                three = "27";
                break;
            case  ("1C"):
                three = "28";
                break;
            case  ("1D"):
                three = "29";
                break;
            case ("1E"):
                three = "30";
                break;
            case ("1F"):
                three = "31";
                break;
            case ("20"):
                three = "32";
                break;
            case ("21"):
                three = "33";
                break;
            case ("22"):
                three = "34";
                break;
            case ("23"):
                three = "35";
                break;



        }

        four = Integer.valueOf(String.valueOf(Integer.parseInt(part[3])), 16);
        int mounth = four;                                                                              //мес

        String day = five;                                                                              //день

        String year = three;                                                                                 //год

        System.out.println(answerOK + " \nФН годен до: (дд/мм/гг) \n\t\t\t" + day + " : " + mounth + " : " + "20"+ year);
    }
}
