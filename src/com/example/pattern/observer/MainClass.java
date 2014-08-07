package com.example.pattern.observer;

public class MainClass {

    public static void main(String[] args) {
        Source source = new Source();
        
        IObserver observer1 = new Observer();
        source.registerObserver(observer1);
        
        source.setValue(2);
        System.out.println(observer1.getChnagedValue());
        IObserver observer2 = new Observer();
        source.registerObserver(observer2);
        source.setValue(7);
        System.out.println(observer1.getChnagedValue());
        source.setValue(2);
        source.setValue(2);
        
        
        
    }

}
