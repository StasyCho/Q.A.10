package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int maxNumber = 9;
    private int minNumber = 0;
    private int radioStationNumber = minNumber;
    private int sumRadioStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int soundVolume = minVolume;

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
