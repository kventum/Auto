package com.company;

public class Main {

    public static void main(String[] args) {
        VwPolo Polo = new VwPolo();
        Polo.seats();
        Polo.accelerate(4,10);

        ToyotaCorolla Corolla = new ToyotaCorolla();
        Corolla.seats();
        Corolla.accelerate(5.5f, 10);

        SkodaRapid Rapid = new SkodaRapid();
        Rapid.seats();
        Rapid.accelerate(4.85f, 10);

        MercedesSprinter Sprinter = new MercedesSprinter();
        Sprinter.seats();
        Sprinter.accelerate(3.5f, 10);

        RenaultKangoo Kangoo = new RenaultKangoo();
        Kangoo.seats();
        Kangoo.accelerate(3, 10);

        Gazelle Gazelle = new Gazelle();
        Gazelle.seats();
        Gazelle.accelerate(2.75f, 10);

        Porshe911 Porshe911 = new Porshe911();
        Porshe911.seats();
        Porshe911.accelerate(7.7f, 10);

        FordMustang Mustang = new FordMustang();
        Mustang.seats();
        Mustang.accelerate(7, 10);

        LamborghiniGallardo Gallargo = new LamborghiniGallardo();
        Gallargo.seats();
        Gallargo.accelerate(7.9f, 10);
    }
}

