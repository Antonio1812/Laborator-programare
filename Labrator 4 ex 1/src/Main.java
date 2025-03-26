import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        for(int i = 0; i < 5; i++) {
            x.add(rand.nextInt(10));
        }
        for(int i = 0; i < 7; i++){
            y.add(rand.nextInt(10));
        }
        for(int i=0;i<5;i++){
            Collections.sort(x);
        }
        for(int i=0;i<7;i++){
            Collections.sort(y);
        }
        System.out.print("Lista x: ");
        for(int i = 0; i < 5; i++){
            System.out.print(x.get(i)+" ");
        }
        System.out.println(" ");
        System.out.print("Lista y: ");
        for(int i = 0; i < 7; i++){
            System.out.print(y.get(i)+" ");
        }

        List<Integer> xPlusY = new ArrayList();
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println(" ");
        System.out.print("Lista x+y: "+xPlusY);

        System.out.println(" ");
        Set<Integer> zSet = new TreeSet();
        for(Object object:x){
            zSet.addAll(x);
            for(Object object2: y){
                zSet.addAll(y);
                if(object.equals(object2)){
                    zSet.remove(object2);
                }
            }
        }
        System.out.println("Lista zSet: "+zSet);

        List<Integer> xMinusY = new ArrayList();
        for(Object object:x){
            if(!y.contains(object)){
                xMinusY.add((Integer)object);
            }
        }
        System.out.println("Lista xMinusY: "+xMinusY);

        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();
        for(Object object:x){
            if((Integer)object<p+1){
                xPlusYLimitedByP.add((Integer)object);
            }
        }
        for(Object object2:y){
            if((Integer)object2<p+1){
                xPlusYLimitedByP.add((Integer)object2);
            }
        }
        System.out.println("Lista xPlusYLimitedByP: "+xPlusYLimitedByP);
    }
}