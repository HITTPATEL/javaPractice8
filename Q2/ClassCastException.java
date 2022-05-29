package day8.Q2;

public class ClassCastException {
      
	public static void main(String[] args) {
		Dog dog = new Dog("black");  
		Animal animal = new Animal("White");  
		animal = dog;  
		animal.show("My dog");  
		  
		Animal animal1 = new Animal("White");  
		Dog d = (Dog)animal1;  
	}
}
//Q2) Explain ClassCastException with the help of the example.
//ClassCast Exception in Java
//ClassCast Exception in Java is one of the unchecked exceptions that 
//occur when we try to convert one class type object into another class type.
//
//ClassCast Exception is thrown when we try to cast an object of the parent
//class to the child class object. However, it can also be thrown when
//we try to convert the objects of two individual classes that don't
//have any relationship between them.
