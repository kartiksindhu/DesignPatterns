package Structural.Composite.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name is: " + this.directoryName);
        for (FileSystem eachFileSystem : fileSystems) {
            eachFileSystem.ls();
        }
    }
}
