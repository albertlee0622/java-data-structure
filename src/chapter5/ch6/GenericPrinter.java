package chapter5.ch6;

public class GenericPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return this.material;
	}
	
	public String toString() {
		return material.toString();
	}
}
