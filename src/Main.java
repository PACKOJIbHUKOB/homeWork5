public class Main {
    public static void main(String[] args) {   task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();}
    private static void task1() {
        System.out.println("задача 1");
        int clientOS = 1;
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    private static void task2() {
        System.out.println("задача 2");
        int clientOS = 1, clientDeviceYear=2015;
        if (clientOS==0) {
            if (clientDeviceYear <=2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите версию приложения для iOS по ссылке");}
        } else if (clientOS==1) {
            if (clientDeviceYear <=2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");}
        }
    }
    private static void task3() {
        System.out.println("задача 3");
        int year = 2021;
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+" год является високосным");
        }else{System.out.println(year+" год неявляется високосным");}
    }
    private static void task4() {
        System.out.println("задача 4");
        int deliveryDistance = 95, deliverydays =1;
        if (deliveryDistance <20){
            System.out.println("Потребуется дней: "+(deliverydays));
        } else if (deliveryDistance>20&&deliveryDistance<60)
        {System.out.println("Потребуется дней: " + (deliverydays + 1));
        } else if (deliveryDistance>60&&deliveryDistance<=100)
        {System.out.println("Потребуется дней: " + (deliverydays + 2));
        }else {System.out.println("доставки нет.");}
    }
    private static void task5() {
        System.out.println("задача 5");}

    private static void task6() {
        System.out.println("задача 6");}

    private static void task7() {
        System.out.println("задача 7");}

    private static void task8() {
        System.out.println("задача 8");}
}