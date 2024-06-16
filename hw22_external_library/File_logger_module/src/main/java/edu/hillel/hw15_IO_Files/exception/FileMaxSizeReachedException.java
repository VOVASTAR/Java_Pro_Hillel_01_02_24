package edu.hillel.hw15_IO_Files.exception;

import java.io.File;

public class FileMaxSizeReachedException extends RuntimeException {
    private File fileLogger;

    public FileMaxSizeReachedException(File fileLogger, String message) {
        super(message);
        this.fileLogger = fileLogger;
    }

    public File getFileLogger() {
        return fileLogger;
    }
}
