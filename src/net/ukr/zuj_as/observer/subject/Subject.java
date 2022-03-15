package net.ukr.zuj_as.observer.subject;

import net.ukr.zuj_as.observer.observer.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
