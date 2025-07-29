import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] coffee = {"Espresso Coffee", "Cappuccino Coffee", "Latte Coffee"};
        String[] tea = {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"};
        String[] soup = {"Hot and Sour Soup", "Veg Corn", "Tomato Soup", "Spicy Tomato Soup"};
        String[] beverage = {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"};

        String drink = sc.nextLine().toLowerCase();

        switch (drink) {
            case "c":
                
                int c1 = sc.nextInt();
                if (c1 > 0 && c1 <= coffee.length) {
                    System.out.println("Welcome to CCD!");
                    System.out.println("Enjoy your" + coffee[c1 - 1] + "!");
                } 
                break;

            case "t":
                
                int t1 = sc.nextInt();
                if (t1 > 0 && t1 <= tea.length) {
                    System.out.println("Welcome to CCD!");
                    System.out.println("Enjoy your " + tea[t1 - 1] + "!");
                } 
                break;

            case "s":
                
                int s1 = sc.nextInt();
                if (s1 > 0 && s1 <= soup.length) {
                    System.out.println("Welcome to CCD!");
                    System.out.println("Enjoy your " + soup[s1 - 1] + "!");
                } 
                break;

            case "b":
                
                int b1 = sc.nextInt();
                if (b1 > 0 && b1 <= beverage.length) {
                    System.out.println("Welcome to CCD!");
                    System.out.println("Enjoy your " + beverage[b1 - 1] + "!");
                } 
                break;

            default:
                System.out.println("INVALID INPUT");
        }

        sc.close();
    }
}
