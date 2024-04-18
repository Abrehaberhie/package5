package homeWork4_15_24;

public class WorkingPlace {
	
	    public static void main(String[] args) {
	        // Create instances of each class
	        Laptop laptop = new Laptop(1, "hp", 345, 8, 12.8, 1, 435, "Intel");
	        Table table = new Table(2, "Study Table", 100, 4, 3, 2, 4);
	        Light light = new Light(3, "LED Bulb", 10, 4, 10, 800);
	        

	        // Testing toString method
	        System.out.println(laptop);
	        System.out.println(table);
	        System.out.println(light);

	        // Testing equals method
	        Laptop laptop2 = new Laptop(1, "hp", 345, 8, 12.8, 1, 435, "Intel");
	        System.out.println("laptop equals laptop2: " + laptop.equals(laptop2));

	        Table table2 = new Table(2, "Study Table", 100, 4, 3, 2, 4);
	        System.out.println("table equals table2: " + table.equals(table2));

	        Light light2 = new Light(3, "LED Bulb", 10, 4, 10, 800);
	        System.out.println("light equals light2: " + light.equals(light2));
	    }

}
