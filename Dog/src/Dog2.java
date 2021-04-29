
public class Dog2 extends Dog {

	String breed = "labrador";
	String color = "white";
	String size = "medium";
	int age = 4;
	String name = "Benji";
	
	static boolean rescue =  false;
	
	public static void rescue() {
		rescue = true;
	}
	
	public static void notRescue() {
		rescue = false;
	}
	
	Dog2 d = newDog();
	d.barks();
	System.out.println("Ruff!");
	
	
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
