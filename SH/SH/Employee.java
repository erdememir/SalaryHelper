public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    int bonus() {
        if (workHours > 40) {
            int extra = workHours - 40;
            int bonus = extra * 30;
            return bonus;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        if (2021 - hireYear < 10) {
            double raise = this.salary * 0.05;
            return raise;
        } else if (2021 - hireYear > 9 && 2021 - hireYear <= 19) {
            double raise = this.salary * 0.1;
            return raise;
        } else if (2021 - hireYear > 19) {
            double raise = this.salary * 0.15;
            return raise;
        } else {
            return 0;
        }
    }

    public String toString() {
        return
                "Adı: " + this.name +
                        "\nMaaşı: " + this.salary +
                        "\nÇalışma saati: " + this.workHours +
                        "\nBaşlangıç yılı: " + this.hireYear +
                        "\nVergi: " + tax() +
                        "\nBonus: " + bonus() +
                        "\nMaaş artışı: " + raiseSalary() +
                        "\nVergi ve bonuslarla birlikte maaş: " + (this.salary + bonus() - tax()) +
                        "\nToplam maaş: " + ((this.salary + bonus() - tax()) + raiseSalary());
    }
}
