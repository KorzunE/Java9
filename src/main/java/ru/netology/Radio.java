package ru.netology;

import jdk.jshell.spi.SPIResolutionException;

public class Radio {
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;

    private int totalStation = 10;

    public Radio () {
    }
    public Radio (int totalStation) {
        this.totalStation = totalStation;
        maxStation = totalStation -1;
    }

    public int getTotalStation() {
        if (totalStation < 0) {
            totalStation = 0;
        }
        return totalStation;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }
}
