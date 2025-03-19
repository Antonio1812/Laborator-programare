package ro.ulbs.paradigme.lab3.util.PasswordMaker;

import java.util.Random;

public class StringRandomizer {
    private static final Random RANDOM = new Random();
    private static final String CARACTERE_VALIDE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String genereazaSirAleator(int lungime) {
        StringBuilder sir = new StringBuilder();
        for (int i = 0; i < lungime; i++) {
            char caracter = CARACTERE_VALIDE.charAt(RANDOM.nextInt(CARACTERE_VALIDE.length()));
            sir.append(caracter);
        }
        return sir.toString();
    }
}
