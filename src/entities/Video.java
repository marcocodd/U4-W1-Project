package entities;

public class Video extends MediaElement implements Playable {
    private int volume;
    private int duration;
    private int brightness;

    public Video(String title, int volume, int brightness, int duration) {
        super(title);
        this.volume = volume;
        this.brightness = brightness;
        this.duration = duration;


    }

    public void setBrightnessUp() {
        this.brightness++;
    }

    public void setBrightnessDown() {
        this.brightness--;
    }

    @Override
    public void play() {
        for (int i = 0; i < this.duration; i++) {
            System.out.print(this.title);
            for (int j = 0; j < this.volume; j++) {
                System.out.print(" !");


            }
            for (int k = 0; k < this.brightness; k++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }


    @Override
    public void volumeUp() {
        this.volume++;
    }

    @Override
    public void volumeDown() {
        this.volume--;
    }

    @Override
    public void launch() {
        play();
    }
}
