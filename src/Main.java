

//################### Methoden Exercise ###################

public class Main {

    public static void main(String[] args) {
        //Easy
        printHello();
        System.out.println(getGreeting());
        printName("John");

        //Medium
        System.out.println(add(5, 7));
        System.out.println("Fläche: " + calculateArea(1.7, 9.5));
        checkPositive(-5);

        // Bonus
        System.out.println(isEven(5));
        printSumMessage();
        System.out.println(subtract(-6, -3));
        System.out.println(multiply(12, 5));
        divide(5, -5);

    }


    //#######  Level 1 - Easy ##################

    // 1. Einfache Methode ohne Rückgabewert
    public static void printHello() {
        System.out.println("Hello Welt!");
    }

    // 2. Einfache Methode mit Rückgabewert
    public static String getGreeting() {
        return "Willkommen im Java-Kurs";
    }

    // 3. Parameter verwenden
    public static void printName(String Name) {
        System.out.println("Name: " + Name);
    }

    //################  Level2 Medium ###############

    //1. Berechnungsmethode
    public static int add(int a, int b) {
        return a + b;
    }

    //2. Mehrere Datentypen zurückgeben
    public static double calculateArea(double width, double height) {
        return width * height;
    }

    //3. Vorzeitiges Beenden
    public static void checkPositive(int zahl) {
        if (zahl < 0) {
            System.out.println("Negative");
            return;
        }
        System.out.println("Positive");
    }

    //################  Level3 Bonus ###############
    // 1. Methode mit Bedingung und Rückgabewert
    public static boolean isEven(int zahl) {
        if (zahl % 2 == 0) {
            System.out.println("Gerade");
            return true;
        } else {
            System.out.println("Ungerade");
            return false;
        }
    }

    // 2. Methode ruft andere Methode auf
    public static void printSumMessage() {
        System.out.println("Print Sum: " + add(1, 5));
    }

    // Mini-Projekt: Taschenrechner
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void divide(double a, double b) {
        if (b == 0) {
            System.out.println("Teilen durch 0 undefined");
            return;
        }
        System.out.println("Devide: " + (a / b));
    }

}


