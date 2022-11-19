package ru.netology.statistic;

public class Radio {
    private int radioStationNumber;
    private int soundVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void nextNumber() {
        int number = radioStationNumber + 1;
        if (radioStationNumber == 9) {
            setRadioStationNumber(0);
        } else {
            setRadioStationNumber(number);
        }
    }

    public void prevNumber() {
        int number = radioStationNumber - 1;
        if (radioStationNumber == 0) {
            setRadioStationNumber(9);
        } else {
            setRadioStationNumber(number);
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
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
