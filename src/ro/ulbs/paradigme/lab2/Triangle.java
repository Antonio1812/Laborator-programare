package ro.ulbs.paradigme.lab2;

public class Triangle extends Form{
    private float height;
    private float base;

    public Triangle(){}

    public Triangle(float base, float height,String color) {
        super(color);
        this.base=base;
        this.height=height;
        counter++;
    }

    public boolean equals(Object obj){
        return this.base==((Triangle)obj).base && this.height==((Triangle)obj).height;
    }

    public float getArea(){
        super.area=base*height/2;
        return super.area;
    }

    public float getHeight() {
        return height;
    }

    public float getBase() {
        return base;
    }
}
