package entities;

public class Image extends MediaElement {
    private int brightness;


    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }


    public void show() {
        for (int i = 0; i < this.brightness; i++) {
            System.out.print(this.title + " ");
            for (int j = 0; j < brightness; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }

    @Override
    public void launch() {
        show();
    }
}
