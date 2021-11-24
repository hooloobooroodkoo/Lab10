package proxyImage;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image img = new ProxyImage("image.jpn");

        img.display(); // with loading

        img.display(); // without loading
    }
}
