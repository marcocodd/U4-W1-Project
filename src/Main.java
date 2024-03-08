import entities.Image;
import entities.RecordedAudio;
import entities.Video;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RecordedAudio track1 = new RecordedAudio("prova1", 5, 5);
        track1.launch();

        System.out.println(" ");

        Video video1 = new Video("Prova Video", 5, 5, 5);
        video1.launch();

        Image image1 = new Image("image1", 5);
        image1.launch();
    }
}