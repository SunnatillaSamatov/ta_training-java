package com.epam.training.SunnatillaSamatov.generics.beawaredogs.house;


import com.epam.training.SunnatillaSamatov.generics.beawaredogs.residents.cats.Cat;
import com.epam.training.SunnatillaSamatov.generics.beawaredogs.residents.cats.Kitten;
import com.epam.training.SunnatillaSamatov.generics.beawaredogs.residents.dogs.Dog;
import com.epam.training.SunnatillaSamatov.generics.beawaredogs.residents.dogs.Puppy;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House dogHouse = new House();
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        dogHouse.enter(murzik); //This must fail on compilation stage if you parameterize the dogHouse. Delete the line when solution is ready
        System.out.println(dogHouse);

        House catHouse = new House();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        catHouse.enter(rex); //This must fail on compilation stage if you parameterize the catHouse. Delete the line when solution is ready
        System.out.println(catHouse);
    }
}
