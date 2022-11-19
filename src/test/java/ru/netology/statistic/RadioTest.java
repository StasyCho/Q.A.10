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

        int expected = rad.getMinNumber();
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
    public void invalidLowerBoundaryRadioStationNumber30 () {
        Radio rad = new Radio(30);

        rad.setRadioStationNumber(-1);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ValidLowerBoundaryRadioStationNumber30 () {
        Radio rad = new Radio(30);

        rad.setRadioStationNumber(0);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber30 () {
        Radio rad = new Radio(30);

        rad.setRadioStationNumber(1);

        int expected = 1;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validBoundaryRadioStationNumber30 () {
        Radio rad = new Radio(30);

        rad.setRadioStationNumber(29);

        int expected = 29;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validUpperBoundaryRadioStationNumber30 () {
        Radio rad = new Radio(30);

        rad.setRadioStationNumber(30);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void invalidUpperBoundarySetRadioStationNumber30 () {
        Radio rad = new Radio(30);

        rad.setRadioStationNumber(31);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumber0 () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(rad.getMaxNumber());

        rad.nextNumber();

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(rad.getMinNumber());

        rad.nextNumber();

        int expected = 1;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextNumberZero () {
        Radio rad = new Radio(60);

        rad.setRadioStationNumber(rad.getMaxNumber());

        rad.nextNumber();

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevNumber () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(rad.getMaxNumber());

        rad.prevNumber();

        int expected = 8;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumber9 () {
        Radio rad = new Radio();

        rad.setRadioStationNumber(rad.getMinNumber());

        rad.prevNumber();

        int expected = rad.getMaxNumber();
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevNumber50 () {
        Radio rad = new Radio(50);

        rad.setRadioStationNumber(rad.getMinNumber());

        rad.prevNumber();

        int expected = 49;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevNumber0 () {
        Radio rad = new Radio(1);

        rad.setRadioStationNumber(rad.getMinNumber());

        rad.prevNumber();

        int expected = rad.getMaxNumber();
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
    @Test
    public void invalidUpperBoundarySoundVolume () {
        Radio rad = new Radio();

        rad.setSoundVolume(111);

        int expected = 0;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseVolume1 () {
        Radio rad = new Radio();

        rad.setSoundVolume(100);

        rad.increaseVolume1();

        int expected = 100;
        int actual = rad.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume1 () {
        Radio rad = new Radio();

        rad.setSoundVolume(99);

        rad.increaseVolume1();

        int expected = 100;
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
