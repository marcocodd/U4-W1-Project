package entities;

public class Image extends MediaElement {
    private int brightness;


    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }


    public void show() {
        System.out.println(this.title);
        for (int i = 0; i < this.brightness; i++) {
            System.out.print(" *");

        }
   
    }


    @Override
    public void launch() {
        show();
    }
}
