import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("in.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))) {
            StringBuilder variantaA = new StringBuilder();
            StringBuilder variantaB = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                variantaA.append(line).append("\n");
                variantaB.append(line.replace(".", ".\n")).append("\n");
            }
            bw.write("=== Varianta A: newline la finalul fiecărei linii ===\n");
            bw.write(variantaA.toString());
            bw.write("\n=== Varianta B: newline după fiecare punct ===\n");
            bw.write(variantaB.toString());
            System.out.println("Rezultat salvat în out.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
