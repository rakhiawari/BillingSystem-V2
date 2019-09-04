import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        int choice, quantity;
        Scanner scanner = new Scanner(System.in);
        Calculate calculate = new Calculate();
        do {
            System.out.println("1.Food\n2.Furniture\n3.Generate bill\n4.Logout");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Quantity:");
                    quantity = scanner.nextInt();
                    calculate.calculateFoodBill(quantity);
                    break;
                case 2:
                    System.out.println("Enter Quantity:");
                    quantity = scanner.nextInt();
                    calculate.calculateFurnitureBill(quantity);
                    break;
                case 3:
                    double total = calculate.generateBill();
                    System.out.println("Bill Amount: " + total);
                case 4:
                    break;
                default:
                    System.out.println("Enter valid choice.");
            }
        } while (choice != 4);
    }
}

