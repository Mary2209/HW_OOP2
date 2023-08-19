import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {
    @Test
    public void testSetRadioStation() {
        Radio radio = new Radio();

        radio.setRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetRadioStationOutOfRangeMore() {
        Radio radio = new Radio();

        radio.setRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetRadioStationOutOfRangeLess() {
        Radio radio = new Radio();

        radio.setRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadioStation() {
        Radio radio = new Radio();

        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadioStationOutOfRange() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStationOutOfRange() {
        Radio radio = new Radio();
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(40);
        int expected = 40;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetVolumeOutOfRangeMore() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSetVolumeOutOfRangeLess() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolumeOutOfRange() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
