import java.lang.Math;

public class classWithException {
    private double radius;
    private double area;
    private double diameter;


    public double getArea() throws Exception{
        this.area = Math.PI*this.radius*this.radius;
        if (this.area>1000){
            throw new Exception("Exceptions");
        }
        return this.area;
    }
        

    public double getDiameter() {
        this.diameter = this.radius * 2;
        return this.diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        if (radius<=0){
            throw new IllegalArgumentException("Number not positive, try again ");
        }

        else{
            this.radius = radius;
        }
        

    }
}
