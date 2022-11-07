package ru.netology.statistic;

public class Radio {
    public int radioStationNumber;
    public int soundVolume;

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

    public void nextNumber (int nextRadioStationNumber) {
        if (nextRadioStationNumber == 9) {
            radioStationNumber = 0;
        }
        if (nextRadioStationNumber < 9) {
            radioStationNumber = nextRadioStationNumber + 1;
        }
    }
    public void prevNumber (int prevRadioStationNumber) {
        if (prevRadioStationNumber == 0) {
            radioStationNumber = 9;
        }
        if (prevRadioStationNumber > 0) {
            radioStationNumber = prevRadioStationNumber - 1;
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

    public void increaseVolume1 () {
        int target = soundVolume + 1;
        setSoundVolume(target);
    }

    public void decreaseVolume1 () {
        int target = soundVolume - 1;
        setSoundVolume(target);
    }
}
