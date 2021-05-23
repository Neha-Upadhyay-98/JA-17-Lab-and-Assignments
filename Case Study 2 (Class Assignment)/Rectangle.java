import java.util.Scanner;

public class Rectangle extends Shape {

	double width;
	double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea(){
		return length*width;
	}
	
	public double getPerimeter(){
		return 2*(length+width);
	}
	
	@Override
	public String toString(){
		Shape s=new Shape();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color with that you want to fill : ");
		s.color=sc.next();
		if(s.color!=null)
			s.filled=true;
		sc.close();
		return "Rectangle [ "+s+", width = "+this.width+", length = "+this.length+" ] ";
	}
}
