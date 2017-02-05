package com.sup.practice.Singleton;


/**
 * 	
 * @author ACER
 * The inner class is referenced no earlier (and therefore loaded no earlier by the class loader) than
 * the moment that getInstance() is called. Thus, this solution is thread-safe without requiring special
 * language constructs (i.e. volatile or synchronized).
 */
public class SingletonOnDemandExample {
	/**
	   * Private constructor.
	   */
	private SingletonOnDemandExample(){}
	
	/**
	   * @return Singleton instance
	   */
	  public static SingletonOnDemandExample getInstance() {
	    return HelperHolder.INSTANCE;
	  }

	  /**
	   * Provides the lazy-loaded Singleton instance.
	   */
	  private static class HelperHolder {
	    private static final SingletonOnDemandExample INSTANCE =
	        new SingletonOnDemandExample();
	  }
	
}

	