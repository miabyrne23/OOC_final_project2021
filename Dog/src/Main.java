
public class Main {

	public static void main(String[] args) {

		
		Dog1 d = (Dog1) new Dog();
		d.setName("Millie");
		d.setAge("3");
		d.setBreed("Shihtzu");
		d.setSize("Small");
		d.setColor("Brown");
		
		System.out.println(d.getName());
		
		System.out.println(d.getAge());
		
		System.out.println(d.getBreed());
		
		System.out.println(d.getSize());
		
		System.out.println(d.getColor());
		
		
		
		Dog2 d = (Dog2) new Dog();
		d.setName("Benji");
		d.setAge("4");
		d.setBreed("Labrador");
		d.setSize("Medium");
		d.setColor("White");
		
		System.out.println(d.getName());
		
		System.out.println(d.getAge());
		
		System.out.println(d.getBreed());
		
		System.out.println(d.getSize());
		
		System.out.println(d.getColor());
		
		
		Dog3 d = (Dog3) new Dog();
		d.setName("Tess");
		d.setAge("2");
		d.setBreed("Newfoundland");
		d.setSize("Large");
		d.setColor("Black");
		
		System.out.println(d.getName());
		
		System.out.println(d.getAge());
		
		System.out.println(d.getBreed());
		
		System.out.println(d.getSize());
		
		System.out.println(d.getColor());
			
		
	}
}

