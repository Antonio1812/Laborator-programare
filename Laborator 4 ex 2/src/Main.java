import java.util.*;
import java.util.stream.Collectors;

class Student {
    String nume;
    String prenume;
    int grupa;
    List<Integer> note;

    public Student(String nume, String prenume, int grupa) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.note = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            this.note.add(rand.nextInt(7) + 4);
        }
    }

    public double getMedie() {
        return note.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int getRestante() {
        return (int) note.stream().filter(n -> n < 5).count();
    }

    public boolean isIntegralist() {
        return getRestante() == 0;
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " | Grupa: " + grupa + " | Note: " + note + " | Medie: " + String.format("%.2f", getMedie());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> studenti = Arrays.asList(
                new Student("Ionescu", "Alex", 101),
                new Student("Popescu", "Maria", 102),
                new Student("Georgescu", "Andrei", 101),
                new Student("Dumitrescu", "Elena", 103),
                new Student("Vasilescu", "Mihai", 102)
        );

        System.out.println("\nAlfabetic pe grupe:");
        studenti.stream()
                .sorted(Comparator.comparing((Student s) -> s.grupa).thenComparing(s -> s.nume))
                .forEach(System.out::println);

        System.out.println("\nIntegraliști după medie:");
        studenti.stream()
                .filter(Student::isIntegralist)
                .sorted(Comparator.comparingDouble(Student::getMedie).reversed())
                .forEach(System.out::println);

        System.out.println("\nRestanțieri după nr. restanțe:");
        studenti.stream()
                .filter(s -> !s.isIntegralist())
                .sorted(Comparator.comparingInt(Student::getRestante))
                .forEach(System.out::println);
    }
}