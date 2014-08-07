package com.example.pattern.observer;

public class Observer implements IObserver{

    private int changedValue = 0;
    
    @Override
    public void notifyChange(int value) {
        System.out.println("Notifying observer...");
        System.out.println(value);
        changedValue = value;
    }
    
    @Override
    public int getChnagedValue(){
        return changedValue;
    }
    
    

}
