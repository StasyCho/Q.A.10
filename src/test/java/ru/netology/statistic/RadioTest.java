package ru.netology.statistic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void invalidLowerBoundaryRadioStationNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(-1);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ValidLowerBoundaryRadioStationNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(0);

        int expected = 0;
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
    public void invalidUpperBoundarySetRadioStationNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(10);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumber0 () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(9);

        rad.nextNumber();

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(8);

        rad.nextNumber();

        int expected = 9;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(9);

        rad.prevNumber();

        int expected = 8;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumber9 () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(0);

        rad.prevNumber();

        int expected = 9;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidLowerBoundarySoundVolume () {
        Radio rad = new Radio();

        rad.setSoundVolume(-1);

        int expected = 0;
        int actual = rad.getSoundVolume();

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

        rad.setSoundVolume(9);

        int expected = 9;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validUpperBoundarySoundVolume () {
        Radio rad = new Radio();

        rad.setSoundVolume(10);

        int expected = 10;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalidUpperBoundarySoundVolume () {
        Radio rad = new Radio();

        rad.setSoundVolume(11);

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume1 () {
        Radio rad = new Radio();

        rad.setSoundVolume(10);

        rad.increaseVolume1();

        int expected = 10;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume1 () {
        Radio rad = new Radio();

        rad.setSoundVolume(9);

        rad.increaseVolume1();

        int expected = 10;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume1 () {
        Radio rad = new Radio();

        rad.setSoundVolume(0);

        rad.decreaseVolume1();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume1 () {
        Radio rad = new Radio();

        rad.setSoundVolume(1);

        rad.decreaseVolume1();

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}
