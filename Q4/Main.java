package day8.Q4;

public class Main {
	
   public static void main(String[] args) {
	  
	   
	   Animal[] animal= {new Cat(),new Dog(),new Tiger()};
	   
//	   for(int i=0; i<animal.length;i++) {
//		   animal[i].eat();
//		   animal[i].walk();
//		   animal[i].makeNoise();
//		   System.out.println("==============");
//	   }
	   
	   for(Animal i :animal){
		     i.eat();
		     i.walk();
		     i.makeNoise();
		     System.out.println("==============");
	   }
	  
	   
//	   animal[0].eat();
//	   animal[0].walk();
//	   animal[0].makeNoise();
//	   System.out.println("==============");
//	   
//	   animal[1].eat();
//	   animal[1].walk();
//	   animal[1].makeNoise();
//	   
//	   System.out.println("==============");
//	   animal[2].eat();
//	   animal[2].walk();
//	   animal[2].makeNoise();
}
}
