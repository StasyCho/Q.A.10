package ru.netology.statistic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {



    @Test
    public void ValidLowerBoundaryRadioStationNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(0);

        int expected = rad.minNumber;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(1);

        int expected = 1;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validBoundaryRadioStationNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(8);

        int expected = 8;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validUpperBoundaryRadioStationNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(9);

        int expected = 9;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void validLowerBoundarySoundVolume () {
        Radio rad = new Radio();

        rad.setSoundVolume(0);

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundVolume () {
        Radio rad = new Radio();

        rad.setSoundVolume(1);

        int expected = 1;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validBoundarySoundVolume () {
        Radio rad = new Radio();

        rad.setSoundVolume(99);

        int expected = 99;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validUpperBoundarySoundVolume () {
        Radio rad = new Radio();

        rad.setSoundVolume(100);

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


}
