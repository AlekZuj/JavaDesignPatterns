package net.ukr.zuj_as.singleton.static_init;

public class Singleton {

	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
}
