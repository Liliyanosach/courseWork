package course;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];


    /*
     * Получить список всех сотрудников со всеми имеющимися по ним данными
     * (вывести в консоль значения всех полей (toString))
     */
    public void getAllData() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /*
     * Посчитать сумму затрат на зарплаты в месяц
     */
    public int salaryPerMonth() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    /*
     *  Найти сотрудника с минимальной зарплатой
     */
    public void findMinSalary() {
        double minValue = Double.MAX_VALUE;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minValue) {
                minValue = employees[i].getSalary();
                employee = employees[i];
            }
        }
        System.out.println("Сотрудник " + employee.getName() + " минимальная заработная плата " + employee.getSalary());
    }

    /*
     * Найти сотрудника с максимальной зарплатой
     */
    public void findMaxSalary() {
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
    public double countAverage() {
        double count = salaryPerMonth() / Employee.counter;
        return count;
    }

    /*
     * Получить Ф. И. О. всех сотрудников (вывести в консоль)
     */
    public void getStaff() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    /*
     * Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
     */
    public double getArgIncreaseSalary(double percent) {
        double increaseSalary = (100 + percent) / 100;
        return increaseSalary;
    }

    /*
     * Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
     */
    public void increaseSalary(double percent) {
        for (Employee employee : employees) {
            employee.setSalary(getArgIncreaseSalary(percent) * employee.getSalary());
        }
        getAllData();
    }

    /*
     * Получить в качестве параметра номер отдела (1–5) и найти сотрудника с минимальной зарплатой
     */
    public void findSalaryMinDepartment(int department) {
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
    public void findSalaryMaxDepartment(int department) {
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
    public double findSumSalaryDepartment(int department) {
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
    public double findCountAverageDepartment(int department) {
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
    public void increaseSalaryDepartment(int department, int percent) {
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(getArgIncreaseSalary(percent) * employees[i].getSalary());
                employee = employees[i];
                System.out.println(" Зарплата после индексации на " + percent + " % " + employee.getName() + " составила " + employee.getSalary());
            }
        }
    }

    /*
     * Напечатать всех сотрудников отдела (все данные, кроме отдела).
     */
    public void printEmployeeDepartment(int department) {
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
    public void findEmployeeLessNumber(int number) {
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
    public void findEmployeeMoreNumber(int number) {
        double salaryMax = number;
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= salaryMax) {
                employee = employees[i];
                System.out.println("Ф.И.О " + employee.getName() + " заработная плата " + employee.getSalary() + " id " + employee.getId());
            }

        }
    }

    /*
     * Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
     * Нужно найти свободную ячейку в массиве и добавить нового сотрудника в нее.
     * Искать нужно всегда с начала, так как возможно добавление в ячейку удаленных ранее сотрудников.
     */

    public void createEmployee(String name, int department, int salary) {
        int index = findFreeIndex();
        if (index == -1) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
            return;
        }
        employees[index] = new Employee(name, department, salary);
    }

    public int findFreeIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
     */
    public void deleteEmployee(String name, int id) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName()) && id == employees[i].getId()) {
                System.out.println(employees[i].getName() + " удален");
                employees[i] = null;
            }
        }
    }

    /*
     * Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись): Изменить зарплату.
     */
    public void changeEmployee(String name, int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName())) {
                employees[i].setSalary(salary);
            }
        }
    }

    /*
     * Изменить отдел. Придумать архитектуру. Сделать или два метода, или один, но продумать его.
     */

    public void changeDepartment(String name, int department) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                employee.setDepartment(department);
            }
        }
    }

    /*
     * Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
     */

    public void printDepartment(){
        for (int i = 1; i < 5; i++) {
            System.out.println("Отдел " + i + ":");
            for (Employee employee: employees){
                if(employee.getDepartment() == i){
                    System.out.println("/t" + employee.getId() + " " + employee.getName());
                }
            }

        }
    }


}
