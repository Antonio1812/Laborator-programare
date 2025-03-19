package ro.ulbs.paradigme.lab2;

public class Circle extends Form{
    private float radius;

    public Circle() {}

    public Circle(float radius,String color){
        super(color);
        this.radius=radius;
        counter++;
    }

    public float getArea(){
        super.area=3.14f*radius*radius;
        return super.area;
    }

    public float getRadius() {
        return radius;
    }
}
