package ru.chukhontsev;

public class Time {
    private int second;

    Time(int second){
        this.second = second % (24 * 60 * 60);
    }
    @Override
    public String toString(){
        int hours = second / 3600;
        int minutes = (second % 3600) / 60;
        int remainingSeconds = second % 60;

        return String.format("%d:%02d:%02d", hours, minutes, remainingSeconds);
    }
}
