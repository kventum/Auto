package com.company;

public abstract class Van implements Auto {
    @Override
    public int seats() {
        return 0;
    }

    public float accelerate(float a, int t) {
        return (a*t);
    }

    static class MercedesSprinter extends Van {
        public float power;
        @Override
        public float accelerate(float a, int t) {
            System.out.println("Mercedes Sprinter за 10 секунд ускоряется на " + super.accelerate(a, t) + " км/ч");
            return a;
        }
        public float consumption(float power) {
            this.power = power;
            System.out.println("Mercedes Sprinter расходует " + (power/9) + " л топлива");
            System.out.println();
            return power;
        }

        @Override
        public int seats() {
            return 19;
        }
    }

    static class RenaultKangoo extends Van {
        public float power;
        @Override
        public float accelerate(float a, int t) {
            System.out.println("Renault Kangoo за 10 секунд ускоряется на " + super.accelerate(a, t) + " км/ч");
            return a;
        }
        public float consumption(float power) {
            this.power = power;
            System.out.println("Renault Kangoo расходует " + (power/10) + " л топлива");
            System.out.println();
            return power;
        }

        @Override
        public int seats() {
            return 7;
        }
    }

    static class Gazelle extends Van {
        public float power;
        @Override
        public float accelerate(float a, int t) {
            System.out.println("Gazelle за 10 секунд ускоряется на " + super.accelerate(a, t) + " км/ч");
            return a;
        }
        public float consumption(float power) {
            this.power = power;
            System.out.println("Gazelle расходует " + (power/8) + " л топлива");
            System.out.println();
            return power;
        }


        @Override
        public int seats() {
            return 15;
        }
    }
}
