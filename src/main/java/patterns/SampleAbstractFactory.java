package patterns;

  interface Animal {
	  public void breathe();
	}
  interface AnimalFactory {
	  public Animal createAnimal();
	}
  class SeaFactory implements AnimalFactory {
	 
	  public Animal createAnimal() {
	    return new Shark();
	  }
	 
	}
  class LandFactory implements AnimalFactory {
	  public Animal createAnimal() {
	    return new Elephant();
	  }
	}
  class Shark implements Animal {
	  public void breathe() {
	    System.out.println("I breathe in water! He he!");
	  }
	}


  class Elephant implements Animal {
	  public void breathe() {
	    System.out.println("I breathe with my lungs. Its easy!");
	  }
	}

  class Wonderland {
	  public Wonderland(AnimalFactory factory) {
	    Animal animal = factory.createAnimal();
	    animal.breathe();
	  }
	}
public class SampleAbstractFactory {

	 
	public static void main(String[] args) {

		 new Wonderland(createAnimalFactory("water"));
	}
	 public static AnimalFactory createAnimalFactory(String type){
		    if("water".equals(type))
		      return new SeaFactory();
		    else
		      return new LandFactory();
		  }
}
