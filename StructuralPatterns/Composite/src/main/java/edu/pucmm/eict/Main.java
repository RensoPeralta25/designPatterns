package edu.pucmm.eict;

import edu.pucmm.eict.component.File;
import edu.pucmm.eict.composite.Folder;
import edu.pucmm.eict.leaf.ImageFile;
import edu.pucmm.eict.leaf.TextFile;

public class Main {
    static void main() {
        File file1 = new TextFile("archivo1.txt");
        File file2 = new ImageFile("archivo2.jpg");

        Folder folder = new Folder("Mi Folder");
        folder.add(file1);
        folder.add(file2);

        folder.show();
    }
}
