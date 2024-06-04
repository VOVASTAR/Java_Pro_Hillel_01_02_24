package edu.hillel.hw15_IO_Files;


import edu.hillel.hw15_IO_Files.config.FileLoggerConfiguration;
import edu.hillel.hw15_IO_Files.config.FileLoggerConfigurationLoader;
import edu.hillel.hw15_IO_Files.config.FileLoggerConfigurationLoaderImp;
import edu.hillel.hw15_IO_Files.exception.ConfigurationLoaderException;
import edu.hillel.hw15_IO_Files.logger.FileLogger;
import edu.hillel.hw15_IO_Files.constants.ConstantsPathToFiles;

public class MainLogger {

    public static void main(String[] args) {
        try {
            FileLoggerConfigurationLoader configurationLoader = new FileLoggerConfigurationLoaderImp();
            FileLoggerConfiguration config = configurationLoader.load(ConstantsPathToFiles.CONFIG_FILE);
            FileLogger fileLogger = new FileLogger(config);
            for (int i = 0; i < 100; i++) {
                fileLogger.debug("debug logging");
                fileLogger.info("info logging");
            }
        } catch (ConfigurationLoaderException e) {
            System.out.println(e.getMessage());
        }
    }
}

