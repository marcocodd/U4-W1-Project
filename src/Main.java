import entities.Image;
import entities.MediaElement;
import entities.RecordedAudio;
import entities.Video;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        RecordedAudio track1 = new RecordedAudio("prova1", 5, 5);
//        track1.launch();
//
//        System.out.println(" ");
//
//        Video video1 = new Video("Prova Video", 5, 5, 5);
//        video1.launch();
//
//        Image image1 = new Image("image1", 5);
//        image1.launch();
        Scanner input = new Scanner(System.in);
        MediaElement[] arrayMedia = new MediaElement[5];
        for (int i = 0; i < arrayMedia.length; i++) {
            System.out.println("Inserire tipo del media tra 'Audio', 'Video' o 'Image' ");
            String type = input.nextLine().toLowerCase();
            if (type.equals("audio")) {
                System.out.println("inserisci titolo dell' audio");
                String titleInput = input.nextLine();
                System.out.println("inserisci la durata dell' audio");
                int playTimeInput = Integer.parseInt(input.nextLine());
                System.out.println("inserisci il volume di partenza dell' audio");
                int volumeInput = Integer.parseInt(input.nextLine());
                arrayMedia[i] = new RecordedAudio(titleInput, playTimeInput, volumeInput);
            } else if (type.equals("video")) {
                System.out.println("inserisci titolo del video");
                String titleVideoInput = input.nextLine();
                System.out.println("inserisci la durata del video");
                int playTimeVideoInput = Integer.parseInt(input.nextLine());
                System.out.println("inserisci il volume di partenza del video");
                int volumeVideoInput = Integer.parseInt(input.nextLine());
                System.out.println("inserisci la luminosità del video");
                int brightnessVideo = Integer.parseInt(input.nextLine());
                arrayMedia[i] = new Video(titleVideoInput, volumeVideoInput, brightnessVideo, playTimeVideoInput);

            } else if (type.equals("image") || type.equals("immagine")) {
                System.out.println("inserisci titolo dell' immagine");
                String titleImage = input.nextLine();
                System.out.println("inserisci luminosità dell' immagine");
                int brightnessImage = Integer.parseInt(input.nextLine());
                arrayMedia[i] = new Image(titleImage, brightnessImage);

            } else {
                System.out.println("tipo inserito non valido");
                i--;
            }
        }

        System.out.println("inserisci quale elemento vuoi avviare da 1 a 5");
        byte i = Byte.parseByte(input.nextLine());
        switch (i) {
            case 1, 2, 3, 4, 5:
                arrayMedia[i - 1].launch();
                break;
            default:
                System.out.println("Media non presente");

        }
        input.close();


    }
}