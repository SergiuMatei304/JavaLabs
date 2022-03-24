package isp.lab3.exercise4;

import static java.lang.Math.sqrt;

public class MyPoint {
    int x;
    int y;
    int z;
    public MyPoint() {
        this.x=0;
        this.y=0;
        this.z=0;
    }
    
    public MyPoint(int x,int y,int z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public void setXYZ(int x,int y,int z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ')';
    }
    
    public double distance(int x,int y,int z){
        return sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) + Math.pow(this.z - z,2));
    }
    
    public double distance(MyPoint anotherpoint){
        return distance(anotherpoint.x,anotherpoint.y,anotherpoint.z);
    }
    public static void main(String[] args) { 
        MyPoint point1= new MyPoint(3,4,5);
        MyPoint point2= new MyPoint(5,7,-3);
        System.out.println("Distanta este:" + point1.distance(point2));
    }
    
}
