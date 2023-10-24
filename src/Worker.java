import java.util.concurrent.atomic.AtomicInteger;

public class Worker {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    private final Integer persNumber;
    private String name;
    private String surname;
    private int age;
    private String phone;

    public Worker(String phone, String name, String surname, int age) {
        this.persNumber = COUNTER.getAndIncrement();
        this.phone = phone;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{persNumber:" + persNumber.toString());
        sb.append(", phone:" + phone);
        sb.append(", name:" + name);
        sb.append(", surname:" + surname);
        sb.append(", age:" + age + "}");
        return sb.toString();
    }

    public String toStringOnlyNumberAndSurname() {
        StringBuilder sb = new StringBuilder();
        sb.append("{phone:" + phone);
        sb.append(", surname:" + surname + "}");
        return sb.toString();
    }

    public String getName() {
        return name;
    }
    public int getExperience() {
        return age;
    }
    public String getSurname() {
        return surname;
    }
    public String getPhone() {
        return phone;
    }
    public Integer getPersNumber() {
        return persNumber;
    }
}