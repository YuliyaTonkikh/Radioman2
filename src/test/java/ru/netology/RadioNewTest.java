package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioNewTest {
    @Test
    public void test() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test1() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);
        int expected = 14;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void test4(){
        Radio radio = new Radio();
        radio.setCurrentVolume(102);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void test5(){
        Radio radio = new Radio(8);
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void test6(){
        Radio radio = new Radio();
        radio.setCurrentVolume(132);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);

    }


}