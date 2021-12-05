import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите имя и число");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] arrayInput = input.trim().split(" ");
        if(arrayInput.length == 2 ){
            String name = arrayInput[0];
            if (isNumber(arrayInput[1])){
                int num = Integer.parseInt(arrayInput[1].trim());
                if(arrayInput[1].length()> 1 && arrayInput[1].length()<6 ){
                    int amount = calcAmount(num);
                    String strAmount = convertNumberToString(amount);
                    creareGreeting(name,strAmount);
                }else {
                    System.out.println("Введите число от 2 до 5 символов");
                }
            } else {
                System.out.println("Введено не корректное число");
            }
        } else {
            System.out.println("Введены не корректные данные");
        }
    }

    public static int calcAmount(int y) {
        if (y / 10 >= 1) {
            int tempvar = y % 10;
            int remain = y / 10;
            return tempvar + calcAmount(remain);
        } else {
            return y;
        }
    }
    public static String convertNumberToString(int num) {
        switch (num)
        {
            case 1 :
                return "Один";
            case 2 :
                return "Два";
            case 3 :
                return "Три";
            case 4 :
                return "Четыре";
            case 5 :
                return "Пять";
            case 6 :
                return "Шесть";
            case 7 :
                return "Семь";
            case 8 :
                return "Восемь";
            case 9 :
                return "Девять";
            case 10 :
                return "Десять";

            default:
                return "Такие числа я еще считать не умею";
        }
    }
    public static void creareGreeting(String name, String amount) {
        System.out.println("Здравствуй "+name+"! Сумма цифр в числе равна = "+amount);
    }

    public static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


