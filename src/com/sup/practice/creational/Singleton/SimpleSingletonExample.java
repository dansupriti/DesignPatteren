package com.sup.practice.creational.Singleton;

/**
 * Singleton Example with Lazy Initialization 
 * When this class will be called from the client side using SingletonExample.getSingletonInstance().printSingleton(); 
 * then at the first time only an instance will be created.
 * During second time onwards for all subsequent calls we will be referring to the same object and the getSingletonInstance() method returns the same instance of the SingletonExample class which was created during the first time. 
 *
 */
public class SimpleSingletonExample {
	// As Static is global variable so static,
	// member holds only one instance of the
    // SingletonExample class
	private static SimpleSingletonExample simpleSingeltonExample;
	
	// SingletonExample prevents any other class from instantiating
	private SimpleSingletonExample(){}
	
	// Providing Global point of access
    public static SimpleSingletonExample getSimpleSingeltonExample() {
        if (null == simpleSingeltonExample) {
        	simpleSingeltonExample = new SimpleSingletonExample();
        	System.out.println("Creating new instance");
        }
        return simpleSingeltonExample;
    }
    
    public void printSingleton(){
        System.out.println("Inside print Singleton");
    }
}
