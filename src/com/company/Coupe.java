package com.company;

public abstract class Coupe implements Auto {
    @Override
    public int seats() {
        return 2;
    }

    public float accelerate(float a, int t) {
        return (a * t);
    }


    static class Porshe911 extends Coupe {
        public float power;
        @Override
        public float accelerate(float a, int t) {
            System.out.println("Porshe 911 за 10 секунд ускоряется на " + super.accelerate(a, t) + " км/ч");
            return a;
        }
        public float consumption(float power) {
            this.power = power;
            System.out.println("Porshe 911 расходует " + (power/18) + " л топлива");
            System.out.println();
            return power;
        }
    }

    static class FordMustang extends Coupe {
        public float power;
        @Override
        public float accelerate(float a, int t) {
            System.out.println("Ford Mustang за 10 секунд ускоряется на " + super.accelerate(a, t) + " км/ч");
            return a;
        }
        public float consumption(float power) {
            this.power = power;
            System.out.println("Ford Mustang расходует " + (power/19) + " л топлива");
            System.out.println();
            return power;
        }
    }

    static class LamborghiniGallardo extends Coupe {
        public float power;
        @Override
        public float accelerate(float a, int t) {
            System.out.println("Lamborghini Gallardo за 10 секунд ускоряется на " + super.accelerate(a, t) + " км/ч");
            return a;
        }
        public float consumption(float power) {
            this.power = power;
            System.out.println("Lamborghini Gallardo расходует " + (power/18) + " л топлива");
            System.out.println();
            return power;
        }
    }
}
