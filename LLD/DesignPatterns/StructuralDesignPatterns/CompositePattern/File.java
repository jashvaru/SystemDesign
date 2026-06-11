package LLD.DesignPatterns.StructuralDesignPatterns.CompositePattern;

public class File implements FileSystemComponent{
    private String fileName;

    File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showDetails() {
        System.out.println("Filename: " + fileName);
    }
}
