package com.jeremy;



public class DinosaurSupervisor {

    public static void main(String[] args) {

        //creating the dinos 
        Dinosaur t_Rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur diplodocus = new Dinosaur();

        //having the dinos use the roar method
        t_Rex.roar();
        velociraptor.roar();
        diplodocus.roar();


    }
}

