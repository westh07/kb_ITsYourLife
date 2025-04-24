package basic.ch08.sec04;

public class Television implements RemoteControl {
    private int vloume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");

    }

    @Override
    public void setVolume(int volume) {
        if(volume < RemoteControl.MIN_VOLUME){
            volume = RemoteControl.MIN_VOLUME;
        } else if (volume > RemoteControl.MAX_VOLUME) {
            volume = RemoteControl.MAX_VOLUME;
        }
        System.out.println("현재 TV 볼륨 : " +volume);

    }
}
