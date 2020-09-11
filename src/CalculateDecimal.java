public class CalculateDecimal extends GetString {
    protected String SwitchDay() {
        switch (day) {
            case ("1A"):
                day = "26";
                break;
            case ("1B"):
                day = "27";
                break;
            case ("1C"):
                day = "28";
                break;
            case ("1D"):
                day = "29";
                break;
            case ("1E"):
                day = "30";
                break;
            case ("1F"):
                day = "31";
                break;
        }
        return day;
    }


    //Наверно месяцы будут указаны в строке, начиная с 0. Я не знаю. Врятли , если вся строка идёт через 2 знака, будет просто A=10
    protected String SwitchMounth() {
        switch (mounth) {
            case ("0A"):
                mounth = "10";
                break;
            case ("0B"):
                mounth = "11";
                break;
            case ("0C"):
                mounth = "12";
                break;
        }
        return mounth;
    }

    //блок свичка года, хватит до 2035. Вот это нужно как-то переводить в пересчет, иначе можно рехнуться.
    protected String SwitchYear() {
        switch (year) {
            case ("15"):
                year = "21";
                break;
            case ("16"):
                year = "22";
                break;
            case ("17"):
                year = "23";
                break;
            case ("18"):
                year = "24";
                break;
            case ("19"):
                year = "25";
                break;
            case ("1A"):
                year = "26";
                break;
            case ("1B"):
                year = "27";
                break;
            case ("1C"):
                year = "28";
                break;
            case ("1D"):
                year = "29";
                break;
            case ("1E"):
                year = "30";
                break;
            case ("1F"):
                year = "31";
                break;
            case ("20"):
                year = "32";
                break;
            case ("21"):
                year = "33";
                break;
            case ("22"):
                year = "34";
                break;
            case ("23"):
                year = "35";
                break;
        }
        return year;
    }
}
