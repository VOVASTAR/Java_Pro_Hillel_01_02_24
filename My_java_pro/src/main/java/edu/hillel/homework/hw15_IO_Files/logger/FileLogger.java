package edu.hillel.homework.hw15_IO_Files.logger;

import edu.hillel.homework.hw15_IO_Files.config.FileLoggerConfiguration;
import edu.hillel.homework.hw15_IO_Files.config.LoggingLevel;
import edu.hillel.homework.hw15_IO_Files.exception.FileMaxSizeReachedException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FileLogger implements Logger {

    public FileLoggerConfiguration fileConfig;
    public File fileLogger;

    public FileLogger(FileLoggerConfiguration fileConfig) {
        this.fileConfig = fileConfig;
        this.fileLogger = new File(fileConfig.getFilePath(), LocalDateTime.now() + ".txt");
    }

    public static String currentDayTime() {
        ZoneId zoneId = ZoneId.of("Europe/Kiev");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(now, zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "EEE MMM dd HH:mm:ss z yyyy", Locale.forLanguageTag("uk-UA"));
        return zonedDateTime.format(formatter);
    }

    private File checkFileSize(LocalDateTime dateTime) {
        long length = fileLogger.length();
        if (fileConfig.getMaxFileSize() <= length) {
            fileLogger = new File(fileConfig.getFilePath(), dateTime + ".txt");
            throw new FileMaxSizeReachedException(fileLogger, "Get FileMaxSizeReachedException with File size : "
                    + length + " bytes, but max size: " + fileConfig.getMaxFileSize() + " bytes, file: " + fileLogger);
        }
        return fileLogger;
    }

    public void debug(String message) {
        if (fileConfig.getLoggingLevel().equals(LoggingLevel.DEBUG)) {
            File file = getFile();
            loggingMethod(file, LoggingLevel.DEBUG, message);
        }
    }

    public void info(String message) {
        if (fileConfig.getLoggingLevel().equals(LoggingLevel.DEBUG)
                || fileConfig.getLoggingLevel().equals(LoggingLevel.INFO)) {
            File file = getFile();
            loggingMethod(file, LoggingLevel.INFO, message);
        }
    }

    private File getFile() {
        File file;
        try {
            file = checkFileSize(LocalDateTime.now());
        } catch (FileMaxSizeReachedException exception) {
            file = exception.getFileLogger();
            System.out.println(exception.getMessage());
        }
        return file;
    }

    private void loggingMethod(File file, LoggingLevel info, String message) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.append(String.format(this.fileConfig.getFileFormat(), currentDayTime(), info, message));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
