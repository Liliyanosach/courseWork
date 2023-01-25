package course;

public class Main {
    private final static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Носач Лилия Николаевна", 1, 50_000);
        employees[1] = new Employee("Иванов Иван Иванович", 2, 32_000);
        employees[2] = new Employee("Кирпота Юлия Викторовна", 3, 35_000);
        employees[3] = new Employee("Букарев Алексей Артемович", 4, 55_000);
        employees[4] = new Employee("Сеч Тамара Антоновна", 5, 39_000);
        employees[5] = new Employee("Бланк Анастасия Викторовна", 1, 47_000);
        employees[6] = new Employee("Счастье Мария Ивановна", 2, 20_000);
        employees[7] = new Employee("Авазова Диана Евгеньевна", 3, 43_000);
        employees[8] = new Employee("Мошкин Кирил Владимирович", 4, 60_000);
        employees[9] = new Employee("Дятлов Петр Петрович", 5, 89_000);

        //getAllData();
        //findMinSalary();
        //findMaxSalary();
        //System.out.println("Сумма затрат на зарплаты в месяц: " + salaryPerMonth());
        //System.out.println("Среднее значение зарплат " + countAverage());
        //getStaff();
        //increaseSalary(10);
        //findSalaryMinDepartment(5);
        //findSalaryMaxDepartment(4);
        //System.out.println("Сумма затрат на зарплату по отделу " + findSumSalaryDepartment(5));
        //System.out.println("Средняя зарплату по отделу " + findCountAverageDepartment(5));
        //increaseSalaryDepartment(5,10);
        //printEmployeeDepartment(5);
        //findEmployeeLessNumber(50000);
        findEmployeeMoreNumber(35000);
    }

    /*
     * Получить список всех сотрудников со всеми имеющимися по ним данными
     * (вывести в консоль значения всех полей (toString))
     */
    public static void getAllData() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /*
     * Посчитать сумму затрат на зарплаты в месяц
     */
    public static int salaryPerMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    /*
     *  Найти сотрудника с минимальной зарплатой
     */
    public static void findMinSalary() {
        double minValue = Double.MAX_VALUE;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary()<minValue){
                minValue = employees[i].getSalary();
                employee = employees[i];
            }
        }
        System.out.println("Сотрудник " + employee.getName() + " минимальная заработная плата " + employee.getSalary());
    }

    /*
     * Найти сотрудника с максимальной зарплатой
     */
    public static void findMaxSalary() {
        double maxValue = Double.MIN_VALUE;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxValue) {
                maxValue = employees[i].getSalary();
                employee = employees[i];
            }
        }
        System.out.println("Сотрудник " + employee.getName() + " максимальная заработная плата " + employee.getSalary());

    }

    /*
     * Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b)
     */
    public static double countAverage() {
        double count = salaryPerMonth() / employees.length;
        return count;
    }

    /*
     * Получить Ф. И. О. всех сотрудников (вывести в консоль)
     */
    public static void getStaff() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    /*
     * Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
     */
    public static double getArgIncreaseSalary(double percent) {
        double increaseSalary = (100 + percent) / 100;
        return increaseSalary;
    }

    /*
     * Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
     */
    public static void increaseSalary(double percent) {
        for (Employee employee : employees) {
            employee.setSalary(getArgIncreaseSalary(percent) * employee.getSalary());
        }
        getAllData();
    }

    /*
     * Получить в качестве параметра номер отдела (1–5) и найти сотрудника с минимальной зарплатой
     */
    public static void findSalaryMinDepartment(int department) {
        double salaryMinEmployee = Double.MAX_VALUE;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() < salaryMinEmployee) {
                employee = employees[i];
                salaryMinEmployee = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник " + employee.getName() + " отдел № " + employee.getDepartment() + " минимальная заработная плата " + employee.getSalary());
    }


    /*
     * Получить в качестве параметра номер отдела (1–5) и найти сотрудника с максимальной зарплатой
     */
    public static void findSalaryMaxDepartment(int department) {
        double salaryMaxEmployee = Double.MIN_VALUE;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department && employees[i].getSalary() > salaryMaxEmployee) {
                employee = employees[i];
                salaryMaxEmployee = employees[i].getSalary();
            }
        }
        System.out.println("Сотрудник " + employee.getName() + " отдел № " + employee.getDepartment() + " максимальная заработная плата " + employee.getSalary());
    }

    /*
     * Получить в качестве параметра номер отдела (1–5) и найти сумму затрат на зарплату по отделу.
     */
    public static double findSumSalaryDepartment(int department) {
        double sum = 0;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
                employee = employees[i];
            }
        }
        return sum;
    }

    /*
     * Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length)
     */
    public static double findCountAverageDepartment(int department) {
        double countDepartment = findSumSalaryDepartment(department);
        int countEmployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                countEmployee++;
            }
        }
        return countDepartment / countEmployee;
    }

    /*
     * Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
     */
    public static void increaseSalaryDepartment(int department, int percent) {
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getDepartment() == department){
                employees[i].setSalary(getArgIncreaseSalary(percent) * employees[i].getSalary());
                employee = employees[i];
                System.out.println(" Зарплата после индексации на " + percent + " % " + employee.getName() + " составила " + employee.getSalary());
            }
        }
    }
    /*
    * Напечатать всех сотрудников отдела (все данные, кроме отдела).
     */
    public static void printEmployeeDepartment(int department) {
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                employee = employees[i];
                System.out.println("Ф.И.О " + employee.getName() + " заработная плата " + employee.getSalary() + " id " + employee.getId());
            }
        }
    }
    /*
    * Получить в качестве параметра число и найти всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
     */
    public static void findEmployeeLessNumber(int number) {
        double salaryMin = number;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salaryMin) {
                employee = employees[i];
                System.out.println("Ф.И.О " + employee.getName() + " заработная плата " + employee.getSalary() + " id " + employee.getId());
            }
        }
    }
    /*
    * Получить в качестве параметра число и найти всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
     */
    public static void findEmployeeMoreNumber(int number) {
        double salaryMax = number;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= salaryMax) {
                employee = employees[i];
                System.out.println("Ф.И.О " + employee.getName() + " заработная плата " + employee.getSalary() + " id " + employee.getId());
            }

        }
    }

}
