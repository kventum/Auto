package com.company;

public abstract class Van implements Auto{
    @Override
    public int seats(){
        return 0;
    }
    public void accelerate(float a, int t){
    }
}
class MercedesSprinter extends Van{
    @Override
    public void accelerate(float a, int t) {
        System.out.println ("Mercedes Sprinter за 10 секунд ускоряется на " + a*t + " км/ч");
    }

    @Override
    public int seats() {
        return 19;
    }
}

class RenaultKangoo extends Van{
    @Override
    public void accelerate(float a, int t){
        System.out.println ("Renault Kangoo за 10 секунд ускоряется на " + a*t + " км/ч");
    };

    @Override
    public int seats() {
        return 7;
    }
}

class Gazelle extends Van{
    @Override
    public void accelerate(float a, int t){
        System.out.println ("Gazelle за 10 секунд ускоряется на " + a*t + " км/ч");
    };

    @Override
    public int seats() {
        return 15;
    }
}
