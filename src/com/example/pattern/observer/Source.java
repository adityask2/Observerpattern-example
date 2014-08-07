package com.example.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Source {
    
    private int value;
    private List<IObserver> observerList;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value != this.value){
            this.value = value;
            notifyObservers();
        }
        
    }
    
    public Source(){
        value = 0;
        observerList = new ArrayList<IObserver>();
    }
    
    public void registerObserver(IObserver observer){
        observerList.add(observer);
    }
    
    public void notifyObservers(){
        for(final IObserver observer: observerList){
            observer.notifyChange(value);
        }
    }
    
    

}
