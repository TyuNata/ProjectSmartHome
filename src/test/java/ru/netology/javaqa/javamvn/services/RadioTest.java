package ru.netology.javaqa.javamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnCorrectCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnCorrectNegativeRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-5);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolume101() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.volumeUp();
        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUpNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeUp();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUp100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumeUp();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.volumeDown();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDownNull() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.volumeDown();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNextAfter9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationNextAfterNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.prev();
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationPrev1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationPrev0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberOfStation11() {
        Radio radio = new Radio();
        radio.setNumberOfStation(11);
        int expected = 10;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberOfStation10() {
        Radio radio = new Radio();
        radio.setNumberOfStation(10);
        int expected = 10;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberOfStation100() {
        Radio radio = new Radio();
        radio.setNumberOfStation(100);
        int expected = 10;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberOfStationNegative() {
        Radio radio = new Radio();
        radio.setNumberOfStation(-25);
        int expected = 10;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberOfStationNull() {
        Radio radio = new Radio();
        radio.setNumberOfStation(0);
        int expected = 0;
        int actual = radio.getNumberOfStation();
        Assertions.assertEquals(expected, actual);
    }
}