package ro.ulbs.paradigme.lab2;

public class Square extends Form {
    private float side;

    public Square() {}

    public Square(float side,String color){
        super(color);
        this.side=side;
        counter++;
    }

    public float getArea(){
        super.area=side*side;
        return super.area;
    }

    public float getSide() {
        return side;
    }
}
