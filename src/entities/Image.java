package entities;

import interfaces.NotPlayable;

public class Image extends MediaElement implements NotPlayable {
    private int brightness;


    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }


    @Override
    public void show() {
        System.out.println(this.title);
        for (int i = 0; i < this.brightness; i++) {
            System.out.print(" *");

        }
        System.out.println(" ");
    }


    @Override
    public void launch() {
        show();
    }
}
