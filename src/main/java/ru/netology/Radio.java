package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int amountStation = 10;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public void setAmountStation(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > amountStation - 1) {
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
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume ++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }

    }


    public void nextStation() {
        if (currentStation < amountStation) {
            currentStation ++;
        }
        if (currentStation >= amountStation) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation --;
        }
        if (currentStation == 0) {
            currentStation --;
        }
        if (currentStation <= -1) {
            currentStation = amountStation - 1;
        }
    }

}