
public class Main {
    public static void main(String[] args) {

        Workers workers = new Workers();
        workers.add(new Worker("+79211234567", "Ivan", "Ivanov", 30));
        workers.add(new Worker("+79212345678", "Petr", "Ivanov", 32));
        workers.add(new Worker("+79213456789", "Fedor", "Stepanov", 32));

        System.out.println("1. Имеется список сотрудников:");
        System.out.println("all workers:\n" + workers);

        System.out.println("\n2. Реализуем метод добавления новых сотрудников в список:\nВыполнено!");
        workers.add(new Worker("+79215678901", "Gleb", "Petrov", 34));
        workers.add(new Worker("+79211342567", "Igor", "Petrov", 35));
        System.out.println("\n3. Дополненный список сотрудников:");
        System.out.println("all workers:\n" + workers);

        System.out.println("\n4. Выведем список сотрудников, чей возраст равен 32 годам:");
        System.out.println("all workers with age = 32:\n" + workers.findEmployeesByExperience(32));

        System.out.println("\n5. Выведем список сотрудников, чей возраст равен 30 годам:");
        System.out.println("all workers with age = 30:\n" + workers.findEmployeesByExperience(30));

        System.out.println("\n6. Выведем номера телефонов у сотрудников с фамилией Ivanov:");
        System.out.println("all number by surname = Ivanov:\n" + workers.findNumberBySurname("Ivanov").toStringOnlyNumberAndSurname());

        System.out.println("\n7. Выведем номера телефонов у сотрудников с фамилией Petrov:");
        System.out.println("all number by surname = Petrov:\n" + workers.findNumberBySurname("Petrov").toStringOnlyNumberAndSurname());

        System.out.println("\n8. Выведем информацию о сотруднике с табельным номером 2:");
        System.out.println("worker with persNumber = 2:\n" + workers.findEmployeesById(2));


    }
}