package com.sanja;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(1);
        printDayOfTheWeek(5);
        printDayOfTheWeek(7);
        printDayOfTheWeek2(3);
        printDayOfTheWeek2(5);
        printDayOfTheWeek2(11);

    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Its Sunday");
                break;
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            default:
                System.out.println("Its Invalid day");
                break;
        }
    }

    private static void printDayOfTheWeek2(int day) {
        if (day == 0) {
            System.out.println("Its Sunday");
        } else if (day == 1) {
            System.out.println("Its Monday");
        } else if (day == 2) {
            System.out.println("Its Thursday");
        } else if (day == 3) {
            System.out.println("Its Wednesday");
        } else if (day == 4) {
            System.out.println("Its Thursday");
        } else if (day == 5) {
            System.out.println("Its Friday");
        } else if (day == 6) {
            System.out.println("Its Saturday");
        } else {
            System.out.println("Its Invalid day");
        }
    }
}
