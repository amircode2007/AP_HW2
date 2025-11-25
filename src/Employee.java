public class Employee extends Person {
    private String employeeId;
    private String position;
    private double salary;
    private int housrsWorked;

    public Employee(String name, String phoneNumber, String position, String employeeId, double salary) {
        super(name, phoneNumber);
        this.employeeId = employeeId;
        this.position = position;
        this.salary = salary;
        this.housrsWorked = housrsWorked;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getHousrsWorked() {
        return this.housrsWorked;
    }

    public void setHousrsWorked(int housrsWorked) {
        this.housrsWorked = housrsWorked;
    }

    public void addHoursWorked(int hour) {
        setHousrsWorked(getHousrsWorked() + hour);
    }

    public double calculateSalary() {

        return (1.5 * getSalary()) * (housrsWorked / 160);
    }

    @Override
    public void getInfo() {
        System.out.print("ID:" + this.employeeId + ", " + "Name:" + getName() + ", " + "Phone:" + getPhoneNumber() + ", " + "Position:" + this.position + ", " + "HoursWorked:" + getHousrsWorked());
    }
}
