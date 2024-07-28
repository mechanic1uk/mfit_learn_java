package ru.chukhontsev.birds;

import java.util.Random;

public class Parrot extends Bird {
    private final String songText;

    public Parrot(String songText){
        this.songText = songText;
    }
    @Override
    public void toSing(){
        Random rnd = new Random();
        int length = rnd.nextInt(songText.length())+1;
        System.out.println();
        System.out.println(songText.substring(0, length));
    }

}
