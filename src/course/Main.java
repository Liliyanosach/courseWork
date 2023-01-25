package course;

public class Main {


    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.createEmployee("Иванов Иван Иванович", 1, 23_000);
        employeeBook.createEmployee("Петров Петр Петрович", 2, 47_000);
        employeeBook.createEmployee("Букарев Алексей Артемович", 3, 36_000);
        employeeBook.createEmployee("Криса Илья Сергеевич", 4, 15_000);
        employeeBook.createEmployee("Фром Андрей Викторович", 5, 46_000);
        employeeBook.createEmployee("Гитбенс Луна Ивановна", 1, 85_000);
        employeeBook.createEmployee("Мика Мария Викторовна", 2, 37_000);
        employeeBook.createEmployee("Счастье Наталья Николаевна", 3, 79_000);
        employeeBook.createEmployee("Проп Алексей Михайлович", 4, 95_000);
        employeeBook.createEmployee("Конец Дмитрий Николаевич", 5, 34_000);

        employeeBook.getAllData();
        employeeBook.deleteEmployee("Фром Андрей Викторович", 5);
        employeeBook.createEmployee("Носенко Андрей Викторович", 5, 39_000);
        employeeBook.getAllData();

        employeeBook.createEmployee("Фром Андрей Викторович",5,46_000);


        employeeBook.changeEmployee("Конец Дмитрий Николаевич", 50_000);
        employeeBook.printEmployeeDepartment(5);

        employeeBook.changeDepartment("Конец Дмитрий Николаевич", 1);
        employeeBook.printDepartment();






    }

}
