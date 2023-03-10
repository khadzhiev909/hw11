public class Main {
    public static void main(String[] args) {
        leapYear(2020);
        os(1, 1111);
        countDays(50);
    }

    public static void leapYear(int years) {
        if (years % 4 == 0) {
            System.out.println(years + " год является високосным");
        } else {
            System.out.println(years + " год не является високосным");
        }

    }

    public static void os(int sistemOP, int nowYears) {


        if(sistemOP > 1) {
            System.out.println("Ошибка, введите коректные данные");
        }


        if (sistemOP == 0 && nowYears < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (sistemOP == 0 && nowYears >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (sistemOP == 1 && nowYears < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (sistemOP == 1 && nowYears >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

    }

    private static int countDays(int deliveryDistance) {

        int day = 0;

        if (deliveryDistance <= 20) {
            System.out.println("На растояние " + deliveryDistance + " км потребуется сутки");
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            day += 2;
            System.out.println("На растояние " + deliveryDistance + " км потребуется " + day + " дней");
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            day += 3;
            System.out.println("На растояние " + deliveryDistance + " км потребуется " + day + " дней");
        } else {
            System.out.println("Доставки нет");
        }

        return day;
    }
}