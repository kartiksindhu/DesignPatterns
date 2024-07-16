package Structural.Composite.FileSystem;

public class Main {

    public static void main(String[] args) {
        Directory mainDirectory = new Directory("Movies");
        File file = new File("Border");
        mainDirectory.add(file);

        Directory secondDirectory = new Directory("ComedyMovies");
        File file1 = new File("The Boys");
        secondDirectory.add(file1);

        mainDirectory.add(secondDirectory);


        mainDirectory.ls();
    }

}
