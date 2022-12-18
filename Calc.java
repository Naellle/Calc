import java.util.Scanner;

public class Calc{

    // а тут все тот же калькулятор который перестал работать когда я решила добавить типы клиентов ъуъ


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summa, payMonthly, rate, result;
        String string = "clientType";
        System.out.println("Выберите тип клиента: ");
        String s = scanner.nextLine();
        switch (string) {
            case "human":
                System.out.println("Введите сумму: ");
                summa = scanner.nextInt();
                System.out.println("Ежемесячный платеж и процентная ставка 10%: " + (summa / 100) * 10);
                rate = (summa/100) * 10;
                payMonthly = (summa + rate);
                result = payMonthly;
                System.out.println("Общая сумма к оплате: " + result);
                break;

                // как бы клиента то он выбирает, но выдает дефолт

            case "busines":
                int summa1, payMonthly1, rate1, result1;
                System.out.println("Введите сумму: ");
                summa1 = scanner.nextInt();
                payMonthly1 = 1;
                while (payMonthly1 > 12){}
                System.out.println("Ежемесячный платеж и процентная ставка 10%: " + (summa1/100)*10);
                rate1 = (summa1/100)*10;
                payMonthly1 = (summa1 + rate1);
                result1 = payMonthly1;
                System.out.println("Общая сумма к оплате: " + result1);
                break;
            default:
                System.out.println("Вы нам не подходите, идите домой:( ");
        }





    }

        }