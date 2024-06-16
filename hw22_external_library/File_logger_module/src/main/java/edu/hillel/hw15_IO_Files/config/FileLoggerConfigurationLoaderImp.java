package edu.hillel.hw15_IO_Files.config;

import edu.hillel.hw15_IO_Files.exception.ConfigurationLoaderException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoaderImp implements FileLoggerConfigurationLoader {

    String filePath;
    String level;
    String maxSize;
    String format;

    @Override
    public FileLoggerConfiguration load(String pathToFile) {
        try (FileReader file = new FileReader(pathToFile);
             BufferedReader bufferedReader = new BufferedReader(file)) {
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String configValue = line.substring(line.indexOf(":") + 1).trim();
                String firstWord = line.split(":")[0].trim();

                switch (firstWord) {
                    case "FILE" -> this.filePath = configValue;
                    case "LEVEL" -> this.level = configValue;
                    case "MAX_SIZE" -> this.maxSize = configValue;
                    case "FORMAT" -> this.format = configValue;
                    default -> throw new ConfigurationLoaderException("Incorrect key in config " + firstWord);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new FileLoggerConfigurationImp(filePath, LoggingLevel.valueOf(level), Long.parseLong(maxSize), format);
    }
}
