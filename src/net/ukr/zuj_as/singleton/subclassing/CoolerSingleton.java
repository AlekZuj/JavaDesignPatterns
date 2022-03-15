package net.ukr.zuj_as.singleton.subclassing;

import net.ukr.zuj_as.singleton.subclassing.Singleton;

public class CoolerSingleton extends Singleton {

	protected static Singleton uniqueInstance;
 
	private CoolerSingleton() {
		super();
	}
}
