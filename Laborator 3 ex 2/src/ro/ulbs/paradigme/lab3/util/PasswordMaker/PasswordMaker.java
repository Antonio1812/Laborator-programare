package ro.ulbs.paradigme.lab3.util.PasswordMaker;

import java.util.Random;

public class PasswordMaker {
    private static final int NUMAR_MAGIC = new Random().nextInt(6) + 5;
    private final String sirMagic;
    private final String nume;

    public PasswordMaker(String nume) {
        this.sirMagic = StringRandomizer.genereazaSirAleator(20);
        this.nume = nume;
    }

    public String getPassword() {
        Random random = new Random();
        String parteAleatoare1 = StringRandomizer.genereazaSirAleator(NUMAR_MAGIC);
        StringBuilder parteAleatoare2 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            parteAleatoare2.append(sirMagic.charAt(random.nextInt(sirMagic.length())));
        }
        String lungimeNume = String.valueOf(nume.length());
        int numarAleator = random.nextInt(51);
        return parteAleatoare1 + parteAleatoare2 + lungimeNume + numarAleator;
    }
}
