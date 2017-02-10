package com.sup.practice.creational.creational.Singleton;

public class DoubleCheakSingletonExample implements Cloneable{
	
	private static DoubleCheakSingletonExample doubleCheakSingeltonInstance;
	//We define the instance reference creation with volatile to avoid multi-thread problem
	//private volatile DoubleCheakSingletonExample doubleCheakSingeltonInstance;
	 
	private DoubleCheakSingletonExample(){
		 // to prevent instantiating by Reflection call
	    if (doubleCheakSingeltonInstance != null) {
	      throw new IllegalStateException("Already initialized.");
	    }
	}
	
	public static DoubleCheakSingletonExample getDoubleCheakSingeltonExample(){
		 // Check if singleton instance is initialized. If it is initialized then we can return the instance.
		if(doubleCheakSingeltonInstance == null){
			synchronized (DoubleCheakSingletonExample.class) {
				if(doubleCheakSingeltonInstance == null){
					// The instance is still not initialized so we can safely (no other thread can enter this zone)
			          // create an instance and make it our singleton instance.
					doubleCheakSingeltonInstance = new DoubleCheakSingletonExample();
				}
			}
		}
		return doubleCheakSingeltonInstance;
	}
	
	//prevent cloning of Object
	public Object clone()throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
//	//prevent object creation by Serialization
//	protected Object readResolve() {
//        return getDoubleCheakSingeltonExample();
//    }
	
}
