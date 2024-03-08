package entities;

public class RecordedAudio extends MediaElement implements Playable {
    private int playTime;
    private int volume;


    public RecordedAudio(String title, int playTime, int volume) {
        super(title);
        this.playTime=playTime;
        this.volume=volume;
    }

public void volumeUp(){
volume++;
}

public void volumeDown(){
        volume--;
}

    @Override
    public void play() {
        for (int i = 0; i <this.playTime; i++) {
            for (int j = 0; j < this.volume; j++) {
                System.out.println("!");
            }
            System.out.println(this.title);

        }
    }
    @Override
    public void launch() {
    play();
        }


}

