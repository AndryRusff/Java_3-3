package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
        return;
        }
        if (currentStation < 0) {
        return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume (int currentVolume) {
            if (currentVolume > 10) {
            return;
            }
            if (currentVolume < 0) {
            return;
            }
           this.currentVolume = currentVolume;
        }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume ++;
        }
        if (currentVolume == 10) {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }

    }


    public void nextStation() {
        if (currentStation < 9) {
            currentStation ++;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation --;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }






}