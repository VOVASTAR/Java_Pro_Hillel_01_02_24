package hw13_junit_tests;


import java.io.IOException;

public class TestRunner {

    public static void main(String[] args) throws IOException {

        ProjectTestRunner testRunner = new ProjectTestRunner();

//        testRunner.runTestInClassByNames("homework.hw13.test.SimpleMathLibraryTest2");
        testRunner.runTestInClassByNames("homework.hw13.test.SimpleMathLibraryTest", "homework.hw13.test.SimpleArrayLibraryTest");
//        testRunner.runTestInClassByNames(SimpleMathLibraryTest.class, SimpleMathLibraryTest2.class);
//        testRunner.runTestInClassByPackageNames("homework.hw13");

        TestResultParser testResultParser = new TestResultParser();
        TestResult parse = testResultParser.parse("src/homework/hw13/testResult.txt");
        System.out.println("Count all run test: " + parse.getRunCount());
        System.out.println("Count passed test: " + parse.getPassedTests());
        System.out.println("Count failure test: " + parse.getFailureCount());
        System.out.println("Date: " + parse.getRunTime());
    }
}

