package chapter5.generic;

public class GenericMethod {
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = -top + bottom;
		return width * height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("Area of Rectangle: " + rect);
	}

}
