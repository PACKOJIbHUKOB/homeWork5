public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    private static void task1() {
        System.out.println("задача 1");
        int clientOS = 0, iOS =0, android=1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else {
            System.out.println("Ваша операционная система не поддерживаеться");
        }
    }
    private static void task2() {
        System.out.println("задача 2");
        int clientOS = 1, clientDeviceYear = 2015, checkYear = 2015, iOS =0, android=1;
        if (clientOS == iOS) {
            if (clientDeviceYear < checkYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == android) {
            if (clientDeviceYear < checkYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }else {
            System.out.println("Ваша операционная система не поддерживаеться");
        }
    }
    private static void task3() {
        System.out.println("задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год неявляется високосным");
        }
    }
    private static void task4() {
        System.out.println("задача 4");
        int deliveryDistance = 95, deliverydays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + (deliverydays));
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliverydays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliverydays + 2));
        } else {
            System.out.println("доставки нет.");
        }
    }
    private static void task5() {
        System.out.println("задача 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("не являеться месяцем");
        }
    }
}