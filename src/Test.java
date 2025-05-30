public class Test {
	
	public static void main(String [] args) {
		
		
		Car c1 = new Car("2ww",1);
		System.out.println(c1.hashCode());
		Car c2 = new Car("2wddww",2);
		System.out.println(c2.hashCode());
		c1=c2;
		System.out.println(c1.hashCode());
		
		
	}

}
