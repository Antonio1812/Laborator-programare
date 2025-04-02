import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        File file = new File("outrand.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,false))){
            for(int i=0;i<5;i++){
                List<String> words = new ArrayList<>();
                for(int j=0;j<10;j++){
                    StringBuilder word = new StringBuilder();
                    for(int k=0;k<4;k++){
                        word.append((char)('a'+rand.nextInt(26)));
                    }
                    words.add(word.toString());
                }
                Collections.sort(words);
                String line = String.join(" ",words);
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Fișierul 'outrand.txt' a fost generat cu succes!");
        }catch(IOException e){
            System.err.println("Eroare la scrierea fișierului: "+e.getMessage());
        }
    }
}
