import java.awt.Color;

/**
 * This class describes a circle with a given radius and color.
 *
 * @author nanajjar
 * @version Spring 25
 */

public class Circle {  
    /** private instance variable, not accessible from outside this class */
    private double radius;
    private Color color;
    private double area;

    /** The default constructor with no argument.*/
    /** It sets the radius and color to their default value.*/
    public Circle() {
        radius = 1.0;
        this.color = new Color(255,119,65);
    }

    /**
	2nd constructor with given radius and color
	@param r as a double that represents radius
	@param clr as a Color object that represents color
	*/
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    /** 
	A public method for retrieving the radius
	@return returns this class's private radius
	*/
    public double getRadius() {
        return radius;
    }

    /**
	A public method for retrieving the color of circle
	@return returns this class's private color
	*/
    public Color getColor() {
        return color;
    }

    /** 
	A public method for retrieving the area of circle
	@return returns the private radius of the circle after being calculated
	*/
    public double getArea() {
        calculateArea();
        return area;
    }
    /**A private method for computing the area of circle*/
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}
