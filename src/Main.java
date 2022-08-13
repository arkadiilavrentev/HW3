public class Main {
    public static void main(String[] args) {

        // Задача 1
        {
            System.out.println("Задача 1");
            int clientOS = 1;
            if (clientOS == 0)
                System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientOS == 1)
                System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println("");
        }
        // Задача 2

        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if(clientOS == 0){
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if(clientOS == 1){
            if (clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println("");

        // Задача 3

        System.out.println("Задача 3");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("");

        // Задача 4

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60){
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        System.out.println("");

        // Задача 5

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Данный месяц принадлежит сезону Зима");
                break;
            case 2:
                System.out.println("Данный месяц принадлежит сезону Зима");
                break;
            case 3:
                System.out.println("Данный месяц принадлежит сезону Весна");
                break;
            case 4:
                System.out.println("Данный месяц принадлежит сезону Весна");
                break;
            case 5:
                System.out.println("Данный месяц принадлежит сезону Весна");
                break;
            case 6:
                System.out.println("Данный месяц принадлежит сезону Лето");
                break;
            case 7:
                System.out.println("Данный месяц принадлежит сезону Лето");
                break;
            case 8:
                System.out.println("Данный месяц принадлежит сезону Лето");
                break;
            case 9:
                System.out.println("Данный месяц принадлежит сезону Осень");
                break;
            case 10:
                System.out.println("Данный месяц принадлежит сезону Осень");
                break;
            case 11:
                System.out.println("Данный месяц принадлежит сезону Осень");
                break;
            case 12:
                System.out.println("Данный месяц принадлежит сезону Зима");
                break;
            default:
                System.out.println("Данный месяц не существует");
        }
        System.out.println("");

        // Задача 6

        {
            System.out.println("Задача 6");
            int age = 19;
            int salary = 58_000;
            int limit = 0;
            if (age >= 23) {
                limit = salary * 3;
                if (salary >= 80_000) {
                    limit *= 1.5;
                } else if (salary >= 50_000) {
                    limit *= 1.2;
                }
            } else {
                limit = salary * 2;
                if (salary >= 80_000) {
                    limit *= 1.5;
                } else if (salary >= 50_000) {
                    limit *= 1.2;
                }
            }
            System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            System.out.println("");
        }

        // Задача 7

        System.out.println("Задача 7");
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        float baseRate = 0.1f;
        if (age < 23){
            baseRate += 0.01;
        } else if (baseRate < 30) {
            baseRate +=0.005;
        }
        if (salary >= 80_000){
            baseRate -= 0.007;
        }
        float monthlyPaiment = (wantedSum + wantedSum * baseRate) / 12;
        System.out.print("Максимальный платёж при зарплате " + salary + " равен " + salary / 2 + " рублей. Платёж по кредиту " + monthlyPaiment + " рублей. ");
        if (salary / 2 >= monthlyPaiment) {
            System.out.println("Одобрено.");
        } else {
            System.out.println("Отказано.");
        }
    }
}