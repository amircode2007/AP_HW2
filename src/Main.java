import java.util.*;

public class Main {
    public static void main(String[] args) {


        Employee e1 = new Employee("Reza", "090111111", "Chef", "E001", 1000000);
        Employee e2 = new Employee("Sara", "090222222", "Accountant", "E002", 4000000);
        Employee e3 = new Employee("Ali", "090333333", "Waiter", "E003", 5000000);

        e1.addHoursWorked(170);
        e2.addHoursWorked(160);
        e3.addHoursWorked(190);

        Customer c1 = new Customer("Amir", "09120001111", "c001");
        Customer c2 = new Customer("Nima", "09120002222", "c002");
        Customer c3 = new Customer("Sara", "09120003333", "c003");
        Customer c4 = new Customer("Maryam", "09120004444", "c004");
        Customer c5 = new Customer("Hossein", "09120005555", "c005");

        MenuItem pizza = new Food("1", "Pizza", 400_000, "Medium", 25);
        MenuItem burger = new Food("2", "Burger", 350_000, "Mild", 15);
        MenuItem steak = new Food("3", "Steak", 900_000, "Spicy", 40);

        MenuItem tea = new Beverage("4", "Tea", 60_000, "Large", "Hot");
        MenuItem cola = new Beverage("5", "Cola", 50_000, "Medium", "Cold");
        MenuItem juice = new Beverage("6", "Juice", 80_000, "Small", "Cold");

        Random rand = new Random();

        List<Customer> customers = Arrays.asList(c1, c2, c3, c4, c5);
        List<MenuItem> allMenu = Arrays.asList(pizza, burger, steak, tea, cola, juice);

        for (Customer c : customers) {
            for (int i = 0; i < 3; i++) {
                List<MenuItem> orderItems = Arrays.asList(
                        allMenu.get(rand.nextInt(allMenu.size())),
                        allMenu.get(rand.nextInt(allMenu.size())),
                        allMenu.get(rand.nextInt(allMenu.size()))
                );
                Order o = new Order(c, orderItems);
                o.getOrderSummary();
                System.out.println("--------------------");
            }
        }


        System.out.println("\n=== Employee Salaries ===");
        e1.getInfo();
        System.out.println(", Final Salary: " + e1.calculateSalary());
        e2.getInfo();
        System.out.println(", Final Salary: " + e2.calculateSalary());
        e3.getInfo();
        System.out.println(", Final Salary: " + e3.calculateSalary());


        Customer best = customers.get(0);
        for (Customer c : customers) {
            if (c.getLoyaltyPoints() > best.getLoyaltyPoints()) best = c;
        }

        System.out.println("\nMost Loyal Customer:");
        best.getInfo();
    }
}
