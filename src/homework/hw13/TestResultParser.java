package homework.hw13;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestResultParser {

    public TestResult parse(String filePath) throws IOException {
        File file = new File(filePath);
        return parse(file);
    }

    public TestResult parse(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            return parse(reader);
        }
    }

    public TestResult parse(Path path) throws IOException {
        return parse(path.toFile());
    }

    private TestResult parse(BufferedReader reader) throws IOException {
        Pattern pattern = Pattern.compile("\\d+");
        TestResult testResult = new TestResult();
        String line;
        int totalTests = 0;
        int passedTests = 0;
        int failedTests = 0;
        Date executionTime = new Date(System.currentTimeMillis());

        while ((line = reader.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                if (line.contains("tests started")) {
                    totalTests = Integer.parseInt(matcher.group(0));
                } else if (line.contains("tests successful")) {
                    passedTests = Integer.parseInt(matcher.group(0));
                } else if (line.contains("tests failed")) {
                    failedTests = Integer.parseInt(matcher.group(0));
                }
            }
        }

        testResult.setTotalTest(totalTests);
        testResult.setPassedTests(passedTests);
        testResult.setFailureTest(failedTests);
        testResult.setRunTime(executionTime);

        return testResult;
    }
}

