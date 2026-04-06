package edu.pucmm.eict.leaf;

import edu.pucmm.eict.component.File;

public class ImageFile implements File {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("ImageFile: " + name);
    }

    @Override
    public void add(File file) {
        throw new UnsupportedOperationException("No se puede agregar a una imagen.");
    }
}
