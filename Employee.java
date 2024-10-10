public class Employee {
    //Attributes
    private String id;
    private String name;
    private String department;
    private double salary;
    private String position;

    //Constructor to initialize the Employee object
    public Employee(String id,String name,String department,double salary,String position){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.position = position;

    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setID (String id){
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setdepartment(String department){
        this.department = department;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getposition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }
    //Method to display employee details
    public void displayDetails(){
        System.out.println("Employee ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Department:" + department);
        System.out.println("Position:" + position);
        System.out.println("Salary:" + salary);

    }
    //Method to calculate bonus (10% of the salary in this case)
    public double calculateBonus(){
        return salary *  0.10;
    }
    public static void main(String[] args){
        //Create an Employee object
        Employee employee = new Employee("F245", "Peter James", "Engineering", 50000.00, "Software Engeering");
        
  
        //Display employee details
        employee.displayDetails();

        //calculate and display the bonus 
        double bonus = employee.calculateBonus();
        System.out.println("Bonus: $" + bonus);
    }
    
}
