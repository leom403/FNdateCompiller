public class GetFRAnswer extends GetString {
    private static String answerOK = "Проверяю статус: ==> Ответ получен, всё исправно";
    private static String answerBad = "Проверяю статус: ==> (!) (!) Что-то не так: \n\t-проверьте настройки в программе, \n\t для надёжности получите № ФР и ФН";
//проверка на успешное чтение. 55 00 - значит, что ошибок от оборудования не поступало. Вывод соответствующей инфо.


    protected String readFRanswer() {
        if (one == 55 && two == 0) {
            return answerOK;
        } else {
            return answerBad;
        }
    }
}
