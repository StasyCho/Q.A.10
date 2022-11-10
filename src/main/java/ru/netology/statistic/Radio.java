package ru.netology.statistic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    public int maxNumber;
    public int minNumber = 0;
    public int radioStationNumber;
    public int sumRadioStation;
    public int maxVolume = 100;
    public int minVolume = 0;
    public int soundVolume = minVolume;





}
