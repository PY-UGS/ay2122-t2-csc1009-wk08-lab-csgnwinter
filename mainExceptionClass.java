import java.util.*;

public class mainExceptionClass {
    public static void main(String[] args) {
        
        double radius;
        double area;
        double diameter;
        boolean check = false;
        while (check!=true){
            try {
                Scanner inp = new Scanner(System.in);
                System.out.print("Enter a radius in double: ");
                radius = inp.nextDouble();
                classWithException circle = new classWithException();
                circle.setRadius(radius);
                area = circle.getArea();
                diameter = circle.getDiameter();

                System.out.println("Diameter of circle is: "+diameter);
                System.out.println("Area of circle is: "+area);
                check = true;
            } catch (InputMismatchException e) {
                //TODO: handle exception
                System.out.println("Not the correct type input. ");
            } 
            catch (IllegalArgumentException tt){
                System.out.println(tt.getMessage());
            }

            catch (Exception t){
                System.out.println("Area too large");
            }
            

        }

    }
    
}

