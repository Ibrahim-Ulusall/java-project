public class Employee {
    /*
     Use of the program
     Employee employee = new Employee( "Kevin" , 2000 , 45 , 1985 );
    */
    private String name;
    private double salary;
    private int workHours;
    private int hireDate;

    Employee(String name,double salary,int workHours,int hireDate){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireDate = hireDate;
    }

    double taxMethod(){
        if(this.salary > 1000) return this.salary * 0.03;
        return this.salary;
    }

    double bonusWorkHoursMethod(){
        int extraWorkHours = this.workHours - 40;
        if(extraWorkHours > 0) return extraWorkHours * 30;
        return 0.0;
    }

    double raiseSalaryMethod(){
        int date = 2015 - this.hireDate;
        if(date < 10) return this.salary * 0.05;
        else if(date < 20 && date > 9) return this.salary * 0.10;
        else return this.salary * 0.15;
    }

    void toStringMethod(){
        double salaryTaxBonus = this.salary + bonusWorkHoursMethod() + taxMethod();
        System.out.println("Name ..................................: " + this.name);
        System.out.println("Salary ................................: " + this.salary + " ₺");
        System.out.println("Work Hours ............................: " + this.workHours);
        System.out.println("Hire Date .............................: " + this.hireDate);
        System.out.println("Tax ...................................: " + taxMethod() + " ₺");
        System.out.println("Bonus .................................: " + bonusWorkHoursMethod() + " ₺");
        System.out.println("Raise of Salary .......................: " + raiseSalaryMethod() + " ₺");
        System.out.println("Salary with tax and bonus .............: " + salaryTaxBonus + " ₺");
        System.out.println("Total Salary with the raise of salary .: " + (this.salary + raiseSalaryMethod()) + " ₺");

    }

}
