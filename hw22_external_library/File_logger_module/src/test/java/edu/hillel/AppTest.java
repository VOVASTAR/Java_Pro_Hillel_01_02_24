package edu.hillel;


import edu.hillel.hw15_IO_Files.config.FileLoggerConfigurationLoader;
import edu.hillel.hw15_IO_Files.config.FileLoggerConfigurationLoaderImp;
import edu.hillel.hw15_IO_Files.constants.ConstantsPathToFiles;
import edu.hillel.hw15_IO_Files.exception.ConfigurationLoaderException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    FileLoggerConfigurationLoader configurationLoader;

    @BeforeEach
    public void setup() {
        configurationLoader = new FileLoggerConfigurationLoaderImp();
    }

    @Test
    public void testConfigurationLoaderException() {
        try {
            configurationLoader.load(ConstantsPathToFiles.CONFIG_FILE_FOR_CHECK_EXCEPTION);
        } catch (ConfigurationLoaderException e) {
            assertEquals("Incorrect key in config FILES", e.getMessage());
        }
    }

}
