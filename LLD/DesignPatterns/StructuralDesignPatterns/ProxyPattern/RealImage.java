package LLD.DesignPatterns.StructuralDesignPatterns.ProxyPattern;

public class RealImage implements Image {

    private String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadImgFromDisk();
    }

    private void loadImgFromDisk() {
        System.out.println("Loading img from disk " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying Img " + fileName);
    }
    
}