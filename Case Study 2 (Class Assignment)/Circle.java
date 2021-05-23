import java.util.Scanner;

public class Circle extends Shape {
	
	public double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		return Math.PI*getRadius()*getRadius();
	}
	
	public double getPerimeter(){
		return 2*Math.PI*getRadius();
	}
	
	@Override
	public String toString(){
		Shape s=new Shape();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the colour to be filled in the circle : ");
		s.color=sc.next();
		if(s.color!=null)
			s.filled=true;
		
		sc.close();
		return "Circle [ "+s+" , radius = "+this.radius+" ] ";
	}
	
}
