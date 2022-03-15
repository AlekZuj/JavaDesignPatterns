package net.ukr.zuj_as.singleton.tread_safe;

public class Singleton {

	private static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
