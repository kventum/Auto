package com.company;

public abstract class Sedan implements Auto{
    @Override
    public int seats(){
        return 5;
    }
    public void accelerate(float a, int t){
    }
}

class VwPolo extends Sedan{
    @Override
    public void accelerate(float a, int t) {
        System.out.println ("Volkswagen Polo за 10 секунд ускоряется на " + a*t + " км/ч");
    }
}

class ToyotaCorolla extends Sedan{
    @Override
    public void accelerate(float a, int t){
        System.out.println ("Toyota Corolla за 10 секунд ускоряется на " + a*t + " км/ч");
    };
}

class SkodaRapid extends Sedan{
    @Override
    public void accelerate(float a, int t){
        System.out.println ("Skoda Rapid за 10 секунд ускоряется на " + a*t + " км/ч");
    };
}
