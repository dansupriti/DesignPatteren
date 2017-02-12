package com.sup.practice.creational.Singleton;

public class TestSingelton {

	public static void main(String args[]){
		SimpleSingletonExample simpleSingeltonExample1 = SimpleSingletonExample.getSimpleSingeltonExample();
		simpleSingeltonExample1.printSingleton();	
		
		SimpleSingletonExample simpleSingeltonExample2 = SimpleSingletonExample.getSimpleSingeltonExample();
		simpleSingeltonExample2.printSingleton();	
		
		System.out.println("reference are same ::" + 
				simpleSingeltonExample1.equals(simpleSingeltonExample2)+ "    " +
				"Hash code are :: " + simpleSingeltonExample1.hashCode() + ", " +
				simpleSingeltonExample2.hashCode());

		EnumSingletonExample.INSTANCE.doStuff();

		//EnumSingeltonExample.INSTANCE.doStuff();

		
//		for(int i=0; i<5; i++){
//			SimpleSingeltonExample.getSimpleSingeltonExample().printSingleton();
//		}
		DoubleCheakSingletonExample doubleCheakSingletonExample = DoubleCheakSingletonExample.getDoubleCheakSingeltonExample();
		System.out.println("doubleCheakSingletonExample :: " + doubleCheakSingletonExample);
		
		StaticFactorySingleton staticFactorySingleton = StaticFactorySingleton.getSingleton();
		System.out.println("Instance :: " + staticFactorySingleton);
	}

}

