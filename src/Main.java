public class Main {
    public static void main(String[] args) {

        // ������ 1
        {
            System.out.println("������ 1");
            int clientOS = 1;
            if (clientOS == 0)
                System.out.println("���������� ������ ���������� ��� iOS �� ������");
            if (clientOS == 1)
                System.out.println("���������� ������ ���������� ��� Android �� ������");
            System.out.println("");
        }
        // ������ 2

        System.out.println("������ 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if(clientOS == 0){
            if (clientDeviceYear >= 2015){
                System.out.println("���������� ������ ���������� ��� iOS �� ������");
            } else {
                System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
            }
        }
        if(clientOS == 1){
            if (clientDeviceYear >= 2015){
                System.out.println("���������� ������ ���������� ��� Android �� ������");
            } else {
                System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
            }
        }
        System.out.println("");

        // ������ 3

        System.out.println("������ 3");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " ��� �������� ����������");
        } else {
            System.out.println(year + " ��� �� �������� ����������");
        }
        System.out.println("");

        // ������ 4

        System.out.println("������ 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("����������� ����: 1");
        } else if (deliveryDistance <= 60){
            System.out.println("����������� ����: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("����������� ����: 3");
        }
        System.out.println("");

        // ������ 5

        System.out.println("������ 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("������ ����� ����������� ������ ����");
                break;
            case 2:
                System.out.println("������ ����� ����������� ������ ����");
                break;
            case 3:
                System.out.println("������ ����� ����������� ������ �����");
                break;
            case 4:
                System.out.println("������ ����� ����������� ������ �����");
                break;
            case 5:
                System.out.println("������ ����� ����������� ������ �����");
                break;
            case 6:
                System.out.println("������ ����� ����������� ������ ����");
                break;
            case 7:
                System.out.println("������ ����� ����������� ������ ����");
                break;
            case 8:
                System.out.println("������ ����� ����������� ������ ����");
                break;
            case 9:
                System.out.println("������ ����� ����������� ������ �����");
                break;
            case 10:
                System.out.println("������ ����� ����������� ������ �����");
                break;
            case 11:
                System.out.println("������ ����� ����������� ������ �����");
                break;
            case 12:
                System.out.println("������ ����� ����������� ������ ����");
                break;
            default:
                System.out.println("������ ����� �� ����������");
        }
        System.out.println("");

        // ������ 6

        {
            System.out.println("������ 6");
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
            System.out.println("�� ������ ������ ��� ��������� ����� � ������� " + limit + " ������");
            System.out.println("");
        }

        // ������ 7

        System.out.println("������ 7");
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
        System.out.print("������������ ����� ��� �������� " + salary + " ����� " + salary / 2 + " ������. ����� �� ������� " + monthlyPaiment + " ������. ");
        if (salary / 2 >= monthlyPaiment) {
            System.out.println("��������.");
        } else {
            System.out.println("��������.");
        }
    }
}