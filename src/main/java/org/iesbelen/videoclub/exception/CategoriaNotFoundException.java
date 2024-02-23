package org.iesbelen.videoclub.exception;

public class CategoriaNotFoundException extends RuntimeException{
    public CategoriaNotFoundException(Long id) {
        super("NO LO ENCUENTRO TIO " + id);
    }
}
