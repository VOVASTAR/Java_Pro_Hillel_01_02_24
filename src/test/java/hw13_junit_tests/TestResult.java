package hw13_junit_tests;

import java.util.Date;

public class TestResult {
    private int runCount;
    private int passedTests;
    private int failureCount;
    private Date runTime;

    public void setPassedTests(int passedTests) {
        this.passedTests = passedTests;
    }

    public void setTotalTest(int runCount) {
        this.runCount = runCount;
    }

    public void setFailureTest(int failureCount) {
        this.failureCount = failureCount;
    }

    public void setRunTime(Date runTime) {
        this.runTime = runTime;
    }

    public int getPassedTests() {
        return passedTests;
    }

    public int getRunCount() {
        return runCount;
    }

    public int getFailureCount() {
        return failureCount;
    }

    public Date getRunTime() {
        return runTime;
    }
}

