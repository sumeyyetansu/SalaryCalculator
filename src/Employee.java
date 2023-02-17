public class Employee {
    String name ;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        double tax = 0;

        if(salary > 1000){
            tax = salary * 0.03;
        }
        return tax;
    }
    double bonus(){
        int bonus = 0;
        if (workHours > 40){
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }
    double raiseSalary(){
        double raise = 2021 - hireYear;
        if(raise < 10){
            raise = salary * 0.05;
        }
        if (raise > 9 && raise < 20){
            raise = salary * 0.10;
        }
        if (raise > 19){
            raise = salary * 0.15;
        }
        return raise;
    }
    public String toString(){
        return "Adı - Soyadı : " + this.name + " \nMaaşı : " + this.salary + "\nÇalışma Saati :" + this.workHours
                + "\nBaşlangıç Yılı : " + this.hireYear +"\nVergi :" + this.tax() + "\nBonus : " + this.bonus()
                + "\nMaaş Artışı : " + this.raiseSalary() + "Vergi ve Bonuslarla Birlikte Maaş : " +((this.salary + this.bonus()) - this.tax())
                + "\nToplam Maaş : " + (this.salary + this.raiseSalary());

    }
}
