/*
Для перевода из 16 в 10 нужно:
каждая 10 часть - это 16 в степени, начиная с 0. 921 = 1*16^0= 1; 2*16^1=2*16; 9*16^2 = 9*256;
потом все эти числа складываются между собой ( 1 + 32 + 2304 )
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите данные из строки ответ через пробел ( )");
        GetString String = new GetString();
        String answer = String.answer;
        GetFRAnswer FRAnswer = new GetFRAnswer();
        FRAnswer.readFRanswer();
        CalculateDecimal resultDecimal = new CalculateDecimal();

        System.out.println("\tВы ввели: " + answer);                                                              //для визуальной проверки ввода
        System.out.println("\t" + FRAnswer.readFRanswer() + " \n\tФН годен до: (дд/мм/гг) \n\t\t" + resultDecimal.SwitchDay() + " : " + resultDecimal.SwitchMounth() + " : 20" + resultDecimal.SwitchYear());

    }
}
