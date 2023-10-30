package week_09.live_class;

public class Tv {
    int channel;
    int volumeLevel;
    boolean isOn;

    Tv() {
        channel = 1;
        volumeLevel = 1;
        isOn = false;
    }

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void setChannel(int newChannel) {
        if (isOn && 0 < channel && channel < 126) {
            channel = newChannel;
        }
    }

    void setVolume(int newVolume) {
        if (isOn && 0 < volumeLevel && volumeLevel < 8) {
            volumeLevel = newVolume;
        }
    }

    void channelUp() {
        if (isOn && 0 < channel && channel < 125) {
            channel++;
        }
    }

    void channelDown() {
        if (isOn && 1 < channel && channel < 126) {
            channel--;
        }
    }

    void volumeLevelDown() {
        if (isOn && 1 < volumeLevel && volumeLevel < 8) {
            volumeLevel--;
        }
    }

    void volumeLevelUp() {
        if (isOn && 0 < volumeLevel && volumeLevel < 7) {
            volumeLevel++;
        }
    }
}
