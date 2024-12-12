public class Main {
    static void task1(int clientOS) {
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    static void task2(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            task1(clientOS);
        }
    }

    static void task3(int year) {
        boolean flag = false;
        if (year > 1584) {
            if (year % 400 == 0) {
                if (year % 100 != 0) {
                    flag = true;
                }
            } else if (year % 4 == 0) {
                flag = true;
            }
        }
        //Alternative solution
        //boolean flag = year > 1584 && (year % 4 == 0 || (year % 100 != 0 && year % 400 == 0));
        System.out.println(year + " год " + (flag ? "" : "не ") + "является високосным");
    }

    static void task4(int deliveryDistance) {
        int daysForDelivery = 1;
        if (deliveryDistance > 0) {
            if (deliveryDistance > 20) {
                daysForDelivery++;
            }
            if (deliveryDistance > 60) {
                daysForDelivery++;
            }
            if (deliveryDistance > 100) {
                daysForDelivery = 0;
            }
        } else {
            System.out.println("Error");
        }
        if (daysForDelivery != 0) {
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else {
            System.out.println("Извините, доставка свыше 100 км не осуществляется");
        }
    }

    static void task5(int monthNumber) {
        String season = switch (monthNumber) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "autumn";
            default -> "error";
        };
        System.out.println(season);
    }

    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание 1");
        int clientOS = 0;
        task1(clientOS);
        //Task 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        task2(0, clientDeviceYear);
        //Task 3
        System.out.println("Задание 3");
        task3(2020);
        task3(1919);
        //Task 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        task4(deliveryDistance);
        //task 5
        System.out.println("Задание 5");
        task5(3);
        task5(12);
        task5(10);
        task5(1);


    }
}