package ro.ulbs.paradigme.lab2;

public class Form{
    private String color;
    float area;
    static int counter = 0;

    public Form(String color) {
        this.color = color;
    }

    public Form(){
        this.color="white";
        this.counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void setColor() {
        color="white";
    }

    public String getColor() {
        return color;
    }

    public int setArea(int area) {
        area=0;
        return area;
    }

    public String toString(){
        return "This Form has the color "+getColor();
    }

    public int getter(){
        return counter;
    }
}
