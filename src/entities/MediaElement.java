package entities;

public abstract class MediaElement {
    protected String title;


    public MediaElement(String title) {
        this.title = title;
    }

    public abstract void launch();


}



