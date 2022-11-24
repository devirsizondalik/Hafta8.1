package Arayüzler;

public class Square implements Poligon{
	public void getArea() {
		int kenar=5;
		int area=kenar*kenar;
		System.out.println("Karenin Alanı: "+area);
	}
	public void getSide() {
		System.out.println("Karenin 4 kenarı vardır.");
		}

}
