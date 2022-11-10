package ru.netology.statistic;

public class Radio {

    public int maxNumber;
    public int minNumber = 0;
    public int radioStationNumber;
    public int sumRadioStation;


    public Radio (int sumRadioStation) {
        this.sumRadioStation = sumRadioStation;
        this.maxNumber = sumRadioStation - 1;
    }
    public Radio () {
        this.sumRadioStation = 10;
        this.maxNumber = 9;
    }
    public int getRadioStationNumber() {
        return radioStationNumber;
    }
    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minNumber) {
            return;
        }
        if (newRadioStationNumber > maxNumber) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void nextNumber(int nextRadioStationNumber) {
        if (nextRadioStationNumber == sumRadioStation) {
            radioStationNumber = minNumber;
        }
        if (nextRadioStationNumber < sumRadioStation) {
            radioStationNumber = nextRadioStationNumber + 1;
        }
    }
    public void prevNumber(int prevRadioStationNumber) {
        if (prevRadioStationNumber == minNumber) {
            radioStationNumber = maxNumber;
        }
        if (prevRadioStationNumber > minNumber) {
            radioStationNumber = prevRadioStationNumber - 1;
        }
    }
    public int maxVolume = 100;
    public int minVolume = 0;
    public int soundVolume = minVolume;

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minVolume) {
            return;
        }
        if (newSoundVolume > maxVolume) {
            return;
        }
        soundVolume = newSoundVolume;
    }
    public void increaseVolume1() {
        int target = soundVolume + 1;
        setSoundVolume(target);
    }
    public void decreaseVolume1() {
        int target = soundVolume - 1;
        setSoundVolume(target);
    }
}
