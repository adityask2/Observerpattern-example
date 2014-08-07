package com.example.pattern.observer;

public interface IObserver {
    
    public static final Source SOURCE = new Source();
    
    public void notifyChange(int value);
    
    public int getChnagedValue();
}
