package ru.netology.statistic;

public class Radio {

    private int maxNumber;
    private int minNumber = 0;
    private int radioStationNumber = minNumber;
    private int sumRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int soundVolume = minVolume;

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
    public int getMaxNumber() {
        return maxNumber;
    }
    public int getMinNumber() {
        return minNumber;
    }
    public int getSoundVolume() {
        return soundVolume;
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
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minVolume) {
            return;
        }
        if (newSoundVolume > maxVolume) {
            return;
        }
        soundVolume = newSoundVolume;
    }
    public void nextNumber() {
        int number = radioStationNumber + 1;
        if (radioStationNumber == maxNumber) {
            setRadioStationNumber(minNumber);
        } else {
            setRadioStationNumber(number);
        }
    }
    public void prevNumber() {
        int number = radioStationNumber - 1;
        if (radioStationNumber == minNumber) {
            setRadioStationNumber(maxNumber);
        } else {
            setRadioStationNumber(number);
        }
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
