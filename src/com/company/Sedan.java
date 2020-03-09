package com.company;

public abstract class Sedan implements Auto {
    @Override
    public int seats() {
        return 5;
    }

    public float accelerate(float a, int t) {
        return (a * t);
    }

    static class VwPolo extends Sedan {
        public float power;
        @Override
        public float consumption(float power) {
            this.power = power;
            System.out.println("Volkswagen Polo расходует " + (power/13) + " л топлива");
            System.out.println();
            return power;
        }

        public float accelerate(float a, int t) {
            System.out.println("Volkswagen Polo за 10 секунд ускоряется на " + super.accelerate(a, t) + " км/ч");
            return a;
        }
    }

    static class ToyotaCorolla extends Sedan {
        float power;
        @Override
        public float consumption(float power) {
            this.power = power;
            System.out.println("Toyota Corolla расходует " + (power/12) + " л топлива");
            System.out.println();
            return power;
        }
        public float accelerate(float a, int t) {
            System.out.println("Toyota Corolla за 10 секунд ускоряется на " + super.accelerate(a, t) + " км/ч /n");
            return a;
        }
    }

    static class SkodaRapid extends Sedan {
        float power;
        @Override
        public float consumption(float power) {
            this.power = power;
            System.out.println("Skoda Rapid расходует " + (power/12) + " л топлива");
            System.out.println();
            return power;
        }
        public float accelerate(float a, int t) {
            System.out.println("Skoda Rapid за 10 секунд ускоряется на " + super.accelerate(a, t) + " км/ч");
            return a;
        }
    }
}