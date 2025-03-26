import java.io.*;
import java.util.*;

public class Main {
    static class Student {
        String nume;
        String prenume;
        String grupa;
        List<Integer> note;

        public Student(String nume, String prenume, String grupa, List<Integer> note) {
            this.nume = nume;
            this.prenume = prenume;
            this.grupa = grupa;
            this.note = note;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return nume.equals(student.nume) && prenume.equals(student.prenume) && grupa.equals(student.grupa) && note.equals(student.note);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nume, prenume, grupa, note);
        }

        @Override
        public String toString() {
            return nume + " " + prenume + " | Grupa: " + grupa + " | Note: " + note;
        }
    }

    public static void main(String[] args) {
        List<Student> studenti = new ArrayList<>();
        Map<Student, Integer> studentCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/studenti.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String nume = parts[0];
                String prenume = parts[1];
                String grupa = parts[2];
                List<Integer> note = new ArrayList<>();
                for (int i = 3; i < parts.length; i++) {
                    note.add(Integer.parseInt(parts[i]));
                }
                Student student = new Student(nume, prenume, grupa, note);
                studenti.add(student);
                studentCount.put(student, studentCount.getOrDefault(student, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nStudenți din fișier:");
        studenti.forEach(System.out::println);

        System.out.println("\nApariții studenți:");
        studentCount.forEach((s, count) -> System.out.println(s + " | Apare de " + count + " ori"));
    }
}
