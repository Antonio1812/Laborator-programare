package ro.ulbs.paradigme.lab3.util.PasswordMaker;

public class Main {
    public static void main(String[] args) {
        PasswordMaker generatorParola = new PasswordMaker("Andrei");
        String parola = generatorParola.getPassword();
        System.out.println("Parola: " + parola);
    }
}
