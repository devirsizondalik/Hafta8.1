package Arayüzler;

public class Triangle implements Poligon {
	protected int a,b,c;
	protected double s,area;	
	Triangle(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
		a=0;
	}
	public void getArea() {
		s=(double)(a+b+c)/2;
		area=Math.sqrt(a*(s-a)*(s-b)*(s-c));
		System.out.println("Üçgenin alanı: "+area);
	}
	
}
