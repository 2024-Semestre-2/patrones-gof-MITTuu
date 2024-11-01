package programa;

public class TV implements Device {
    private boolean on = false;
    private int volume = 50;
    private int channel = 1;

    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 0 && percent <= 100) {
            volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "TV [on=" + on + ", volume=" + volume + ", channel=" + channel + "]";
    }
}
