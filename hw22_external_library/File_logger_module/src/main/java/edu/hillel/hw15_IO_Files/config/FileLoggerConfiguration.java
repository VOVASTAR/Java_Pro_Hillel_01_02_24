package edu.hillel.hw15_IO_Files.config;

public interface FileLoggerConfiguration {

    String getFilePath();

    LoggingLevel getLoggingLevel();

    long getMaxFileSize();

    String getFileFormat();
}
