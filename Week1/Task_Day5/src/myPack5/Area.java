package myPack5;

public class Area {
	public double area(double side){
		return side*side;
	}
	public double area(double height,double width){
		return height*width;
	 	
	}
	public double area(double a,double b,double h){
		return ((a+b)/2)*h;
		}

}
class Shape extends Area{
public static void main(String[] args) {
	Shape square = new Shape();
	Shape rectangle = new Shape();
	Shape trapazium = new Shape();
	System.out.println(""+square.area(10));
	System.out.println(""+rectangle.area(10,2));
	System.out.println(""+trapazium.area(10,2,3));

	
}
}