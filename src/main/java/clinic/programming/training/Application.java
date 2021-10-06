package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
    }
	
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		
		for(String greeting: greetings) {
			System.out.println("Greeting: " + greeting);
		}
	}
}