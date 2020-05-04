package Staff;

public abstract class Employee {
    private String name;
    private String nationalInsuranceNumber;
    private double salary;

    public Employee(String name, String nationalInsuranceNumber, int salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName){
        if(newName != null) {
            this.name = newName;
        }
    }

    public String getNationalInsuranceNumber() {
        return this.nationalInsuranceNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double salaryRaise){
        if(salaryRaise>=0){
            this.salary+=salaryRaise;
        }
    }

    public double payBonus(){
        return this.salary*0.01;
    }

}
