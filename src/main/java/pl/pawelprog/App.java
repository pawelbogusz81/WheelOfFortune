package pl.pawelprog;

import java.util.Scanner;

public class App {
    public static void main (String[] args){

        System.out.println("Witaj w Kole Fortuny!");

        //Tworzenie nowego gracza z klasy static
        String inputName = "Layer";
        System.out.println(addNewPlayer(inputName));

    }

    public static Player addNewPlayer(String name){
    if (name == null || name.isBlank()) {
    throw new IllegalArgumentException("Twoje imię musi mieć min. jeden znak!");
    }
    return new Player(name);
    }
}

