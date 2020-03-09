package com.company;

public class Main {

    public static void main(String[] args) {
        Sedan.VwPolo Polo = new Sedan.VwPolo();
        Polo.seats();
        Polo.accelerate(4.2f,10);
        Polo.consumption(110);

        Sedan.ToyotaCorolla Corolla = new Sedan.ToyotaCorolla();
        Corolla.seats();
        Corolla.accelerate(5.2f, 10);
        Corolla.consumption(122);

        Sedan.SkodaRapid Rapid = new Sedan.SkodaRapid();
        Rapid.seats();
        Rapid.accelerate(4.45f, 10);
        Rapid.consumption(90);

        Van.MercedesSprinter Sprinter = new Van.MercedesSprinter();
        Sprinter.seats();
        Sprinter.accelerate(3.5f, 10);
        Sprinter.consumption(136);

        Van.RenaultKangoo Kangoo = new Van.RenaultKangoo();
        Kangoo.seats();
        Kangoo.accelerate(3.3f, 10);
        Kangoo.consumption(102);

        Van.Gazelle Gazelle = new Van.Gazelle();
        Gazelle.seats();
        Gazelle.accelerate(2.85f, 10);
        Gazelle.consumption(120);

        Coupe.Porshe911 Porshe911 = new Coupe.Porshe911();
        Porshe911.seats();
        Porshe911.accelerate(7.7f, 10);
        Porshe911.consumption(450);

        Coupe.FordMustang Mustang = new Coupe.FordMustang();
        Mustang.seats();
        Mustang.accelerate(6.6f, 10);
        Mustang.consumption(317);

        Coupe.LamborghiniGallardo Gallardo = new Coupe.LamborghiniGallardo();
        Gallardo.seats();
        Gallardo.accelerate(7.9f, 10);
        Gallardo.consumption(560);
    }
}
