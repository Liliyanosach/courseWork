package course;

public class Main {
    private static final Employee[] employees = new Employee[10];

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

        /*
         * Получить список всех сотрудников со всеми имеющимися по ним данными
         * (вывести в консоль значения всех полей (toString))
         */
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Сумма затрат на зарплаты в месяц: " + salaryPerMonth());
        System.out.println("Сотрудник с минимальной зарплатой " + findMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой " + findMaxSalary());
        System.out.println("Среднее значение зарплат " + countAverage());
        getStaff();

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
    public static int findMinSalary() {
        int minValue = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() < minValue) {
                minValue = employee.getSalary();
            }
        }
        return minValue;
    }

    /*
     * Найти сотрудника с максимальной зарплатой
     */
    public static int findMaxSalary() {
        int maxValue = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee.getSalary() > maxValue) {
                maxValue = employee.getSalary();
            }
        }
        return maxValue;
    }

    /*
     * Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b)
     */
    public static double countAverage() {
        ;
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
}
