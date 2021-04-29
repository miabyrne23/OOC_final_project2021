
public class Dog3 extends Dog {

	String breed = "newfoundland";
	String color = "black and brown";
	String size = "large";
	int age = 2;
	String name = "Tess";
	
	static boolean rescue =  false;
	
	public static void rescue() {
		rescue = true;
	}
	
	public static void notRescue() {
		rescue = false;
	}
	
	Dog1 d = newDog();
	d.barks();
	System.out.println("Bork!");
	
	public void setName(String newName) {
		name = newName;
	}

		public String getName() {
		return name;
	}


		public void setAge(int newAge) {
		age = newAge;
		
	}

		public int getAge() {
		return age;
		
	}

		public void setBreed(String newBreed) {
		breed = newBreed;
	}

		public String getBreed() {
		return breed;
	}

		public void setSize(String newSize) {
		size = newSize;
	}

		public String getSize() {
		return size;
	}

		public void setColor(String newColor) {
		color = newColor;
	}

		public String getColor() {
		return color;
	}



}
