package proxyImage;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String imageName;

    public ProxyImage(String fileName) {
        this.imageName = fileName;
    }
    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(imageName);
        }
        realImage.display();
    }

}
