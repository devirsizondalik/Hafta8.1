package Arayüzler;

public interface Poligon {
	void getArea();
	default void getSides() {
		System.out.println("Poligon kenar sayısı ");
	}
	default void getPerimeter(int... sides) {
		int perimeter=0;
		for(int side: sides) {
		perimeter+=side;
		}
		System.out.println("Çokgenin Çevresi : "+perimeter);
	}
}
