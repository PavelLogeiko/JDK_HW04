import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Workers {
    private ArrayList<Worker> workers;

    public Workers() {
        this.workers = new ArrayList<Worker>();
    }

    public Workers(ArrayList<Worker>workers) {
        this.workers = workers;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Worker worker : workers) {
            sb.append(worker + "\n");
        }
        if (sb.length() == 0) sb.append("The list is empty.\n");
        return sb.toString();
    }

    public void add(Worker worker){
        workers.add(worker);
    }

    public Workers findEmployeesByExperience(int age){
        return (new Workers((ArrayList<Worker>)(workers.
                stream().
                filter(worker -> worker.getExperience() == age).
                sorted(Comparator.comparing(Worker::getSurname)).
                collect(Collectors.toList()))));
    }

    public String toStringOnlyNumberAndSurname() {
        StringBuilder sb = new StringBuilder();
        for (Worker worker : workers) {
            sb.append(worker.toStringOnlyNumberAndSurname() + "\n");
        }
        if (sb.length() == 0) sb.append("The list is empty.\n");
        return sb.toString();
    }

    public Workers findNumberBySurname(String surname){
        return (new Workers((ArrayList<Worker>)(workers.
                stream().
                filter(worker -> worker.getSurname() == surname).
                sorted(Comparator.comparing(Worker::getSurname)).
                collect(Collectors.toList()))));
    }

    public Workers findEmployeesById(Integer persNumber){
        return (new Workers((ArrayList<Worker>)(workers.
                stream().
                filter(worker -> worker.getPersNumber() == persNumber).
                sorted(Comparator.comparing(Worker::getSurname)).
                collect(Collectors.toList()))));
    }
}