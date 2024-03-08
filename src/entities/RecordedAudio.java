package entities;

import interfaces.Playable;

public class RecordedAudio extends MediaElement implements Playable {
    private int playTime;
    private int volume;


    public RecordedAudio(String title, int playTime, int volume) {
        super(title);
        this.playTime = playTime;
        this.volume = volume;
    }


    @Override
    public void play() {
        for (int i = 0; i < this.playTime; i++) {
            System.out.print(this.title + " ");
            for (int j = 0; j < this.volume; j++) {
                System.out.print("!" + " ");
            }


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

