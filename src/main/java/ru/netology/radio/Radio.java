package ru.netology.radio;

public class Radio {
    int currentStation = 0;
    int currentVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation >= 0 && radioStation <=9) {
            currentStation = radioStation;
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            setRadioStation(0);
        } else {
            setRadioStation(currentStation+1);
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            setRadioStation(9);
        } else {
            setRadioStation(currentStation-1);
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <=100) {
            currentVolume = volume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
