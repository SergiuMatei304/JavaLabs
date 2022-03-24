package isp.lab3.exercise2;

public class Rectangle {
    private int length=2;
    private int width=1;
    private String color="red";

    public void setLengthandwidth(int length, int width) {
        this.length = length;
        this.width = width;
    }  
    
    public void setLengthandwidthandColor(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color=color;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
    
    public int getPerimeter() {
        return 2*width+2*length;
    }
    
    public int getArea() {
        return width*length;
    }
    public static void main(String args[]){
        Rectangle rectangle = new Rectangle();
        System.out.println("This rectangle has:");
        System.out.println("Length:");
        System.out.println(rectangle.getLength());
        System.out.println("Width:");
        System.out.println(rectangle.getWidth());
        System.out.println("Color:");
        System.out.println(rectangle.getColor());
        System.out.println("Perimeter:");
        System.out.println(rectangle.getPerimeter());
        System.out.println("Area:");
        System.out.println(rectangle.getArea());
        rectangle.setLengthandwidthandColor(5, 5, "blue");
        System.out.println("This rectangle has:");
        System.out.println("Length:");
        System.out.println(rectangle.getLength());
        System.out.println("Width:");
        System.out.println(rectangle.getWidth());
        System.out.println("Color:");
        System.out.println(rectangle.getColor());
        System.out.println("Perimeter:");
        System.out.println(rectangle.getPerimeter());
        System.out.println("Area:");
        System.out.println(rectangle.getArea());
    }
}
