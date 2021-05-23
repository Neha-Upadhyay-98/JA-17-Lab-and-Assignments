import java.util.Scanner;

public class MainShape {

	public static void CircleData(){
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Enter radius : ");
		c.radius=sc.nextDouble();
		System.out.println(c);
		System.out.println("Area = "+c.getArea());
		System.out.println("Perimeter = "+c.getPerimeter());
		
		sc.close();
	}
	
	public static void RectangleData(){
		Scanner sc=new Scanner(System.in);
		Rectangle r=new Rectangle();
		System.out.println("Enter length : ");
		r.length=sc.nextDouble();
		System.out.println("Enter width : ");
		r.width=sc.nextDouble();
		System.out.println("Area = "+r.getArea());
		System.out.println("Perimeter = "+r.getPerimeter());
		
		sc.close();
	}
	
	public static void SquareData(){
		Scanner sc=new Scanner(System.in);
		Square sq=new Square();
		System.out.println("Enter side : ");
		sq.length=sc.nextDouble();
		System.out.println(sq);
		System.out.println("Area = "+sq.getArea());
		System.out.println("Perimeter = "+sq.getPerimeter());
		
		sc.close();
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int choice;
		System.out.println("Choose from the following :\n1. Circle\n2. Rectangle\n3. Square\nEnter your choice :");
		choice=sc.nextInt();
		while(true){
			if(choice==1){
				CircleData();
			}
			else if(choice==2){
				RectangleData();
			}
			else if(choice==3){
				SquareData();
			}
			else{
				System.out.println("Wrong choice");
				return;
			}
		}
	}
}
