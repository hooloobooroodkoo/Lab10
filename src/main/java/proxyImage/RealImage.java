package proxyImage;

public class RealImage implements Image{
    private String imageName;

    public RealImage(String filename) {
        this.imageName = filename;
        loadFromDisk(filename);
    }
    @Override
    public void display() {
        System.out.println("Display " + imageName);
    }
    public void loadFromDisk(String path) {
        System.out.println("Load " + path);
    }
}
