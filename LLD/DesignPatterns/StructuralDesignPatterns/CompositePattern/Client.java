package LLD.DesignPatterns.StructuralDesignPatterns.CompositePattern;

public class Client {
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");

        Folder folder = new Folder("Folder");
        folder.addComponent(file1);
        folder.addComponent(file2);

        Folder subFolder = new Folder("Subfolder");
        File file3 = new File("File3.txt");
        subFolder.addComponent(file3);

        folder.addComponent(subFolder);

        folder.showDetails();
        subFolder.showDetails();
    }
}
