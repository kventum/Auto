package com.company;

public abstract class Coupe implements Auto{
    @Override
    public int seats(){
        return 2;
    }
    public void accelerate(float a, int t){
    }
}

class Porshe911 extends Coupe{
    @Override
    public void accelerate(float a, int t) {
        System.out.println ("Porshe 911 за 10 секунд ускоряется на " + a*t + " км/ч");
    }
}

class FordMustang extends Coupe{
    @Override
    public void accelerate(float a, int t){
        System.out.println ("Ford Mustang за 10 секунд ускоряется на " + a*t + " км/ч");
    };
}

class LamborghiniGallardo extends Coupe{
    @Override
    public void accelerate(float a, int t){
        System.out.println ("Lamborghini Gallardo за 10 секунд ускоряется на " + a*t + " км/ч");
    };
}
