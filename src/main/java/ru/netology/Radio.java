package ru.netology;

public class Radio {
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int minStation = 0;
    private int maxStation;

    private int countStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int countStation) {
        this.maxStation = countStation - 1;
        this.countStation = countStation;
    }

    public int getCountStation() {
        return countStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < minVolume) {
            return;
        }
        if (CurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void installMaxVolume() {
        this.currentVolume = maxVolume;
    }

    public void installMinVolume() {
        this.currentVolume = minVolume;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < minStation) {
            return;
        }
        if (CurrentStation > maxStation) {
            return;
        }
        this.currentStation = CurrentStation;
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
