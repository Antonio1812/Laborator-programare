import ro.ulbs.paradigme.lab2.Circle;
import ro.ulbs.paradigme.lab2.Form;
import ro.ulbs.paradigme.lab2.Square;
import ro.ulbs.paradigme.lab2.Triangle;

public class Main {
    public static void main(String[] args) {
        Form forma=new Form("white");

        Square patrat=new Square(1.2F,"blue");
        Triangle triunghi=new Triangle(1.1F,2.0F,"red");
        Circle cerc=new Circle(1.5F,"yellow");

        System.out.println("Square Area= "+ patrat.getArea());
        System.out.println("Triangle Area= "+ triunghi.getArea());
        System.out.println("Circle Area= "+ cerc.getArea());

        Triangle triangle2=new Triangle(1.1F, 2.0F, "red");
        System.out.println(triangle2.equals(triunghi));
        Triangle triangle3=new Triangle(1.1F, 2.0F, "brown");
        System.out.println(triangle3.equals(triangle2));

        System.out.println(forma.getter());
    }
}