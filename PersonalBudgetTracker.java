import java.util.Scanner;

public class PersonalBudgetTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] expenses = new String[10];
        double[] amounts = new double[10];

        double budget, total = 0;
        int choice, count = 0;

        System.out.println("===== PERSONAL BUDGET TRACKER =====");

        System.out.print("Enter your monthly budget: ₱");
        budget = sc.nextDouble();

        do {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Budget Summary");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < expenses.length) {

                        sc.nextLine();

                        System.out.print("Enter expense name: ");
                        expenses[count] = sc.nextLine();

                        System.out.print("Enter amount: ₱");
                        amounts[count] = sc.nextDouble();

                        if (amounts[count] > 0) {
                            total += amounts[count];
                            count++;
                            System.out.println("Expense added successfully!");
                        } else {
                            System.out.println("Invalid amount!");
                        }

                    } else {
                        System.out.println("Expense limit reached!");
                    }
                    break;

                case 2:
                    System.out.println("\n===== BUDGET SUMMARY =====");

                    for (int i = 0; i < count; i++) {
                        System.out.println(expenses[i] + " : ₱" + amounts[i]);
                    }

                    System.out.println("--------------------------");
                    System.out.println("Monthly Budget: ₱" + budget);
                    System.out.println("Total Expenses: ₱" + total);
                    System.out.println("Remaining Balance: ₱" + (budget - total));

                    if (total > budget) {
                        System.out.println("Warning: You exceeded your budget!");
                    } else {
                        System.out.println("Status: Within Budget!");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Personal Budget Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
