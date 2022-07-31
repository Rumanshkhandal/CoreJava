package oops;

public class OverLoadingExample {

	public int GetArea(int l, int b) {
		 return l*b;
		 
		}
	
	public int GetArea1(int l) {
		
		return l*l;
		
	}
	
	public int GetArea(int l) {
		
		return l*l;
	}
}
