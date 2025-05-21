import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("Acesta", "este", "un", "program", "scris", "cu", "java", "8", "si", "expresii", "lambda");

        List<String> longWords = words.stream()
                .filter(word -> word.length() >= 5)
                .collect(Collectors.toList());

        System.out.println("Cuvintele cu cel putin 5 caractere: " + longWords);
        System.out.println("Numarul lor: " + longWords.size());

        List<String> sortedWords = new ArrayList<>(longWords);
        sortedWords.sort(String::compareTo);

        System.out.println("Lista ordonata: " + sortedWords);

        String startsWithP = words.stream()
                .filter(word -> word.startsWith("p"))
                .findFirst()
                .orElse("Nu exista cuvinte care incep cu 'p'");

        System.out.println("Primul cuvant care incepe cu 'p': " + startsWithP);
    }
}
