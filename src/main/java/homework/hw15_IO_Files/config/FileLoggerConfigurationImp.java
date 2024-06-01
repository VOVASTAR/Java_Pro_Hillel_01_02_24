package homework.hw15_IO_Files.config;

public class FileLoggerConfigurationImp implements FileLoggerConfiguration {

    private String filePath;
    private LoggingLevel loggingLevel;
    private long maxFileSize;
    private String fileFormat;

    public FileLoggerConfigurationImp(String filePath, LoggingLevel loggingLevel, long maxFileSize, String fileFormat) {
        this.filePath = filePath;
        this.loggingLevel = loggingLevel;
        this.maxFileSize = maxFileSize;
        this.fileFormat = fileFormat;
    }

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    @Override
    public long getMaxFileSize() {
        return maxFileSize;
    }

    @Override
    public String getFileFormat() {
        return fileFormat;
    }
}
