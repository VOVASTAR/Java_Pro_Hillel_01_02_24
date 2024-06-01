package edu.hillel.hw13_junit_tests;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ProjectTestRunner {

    public void runTestInClassByNames(Class<?>... classNames) {
        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        LauncherDiscoveryRequestBuilder requestBuilder = LauncherDiscoveryRequestBuilder.request();
        for (Class<?> className : classNames) {
            requestBuilder.selectors(DiscoverySelectors.selectClass(className));
        }
        LauncherDiscoveryRequest request = requestBuilder.build();

        launcher.execute(request, listener);

        printData(listener);
    }

    private void printData(SummaryGeneratingListener listener) {
        PrintWriter writerToConsole = new PrintWriter(System.out);
        try (PrintWriter writerToFile = new PrintWriter(new FileOutputStream("src/homework/hw13/testResult.txt"))) {
            listener.getSummary().printTo(writerToConsole);
            listener.getSummary().printTo(writerToFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void runTestInClassByNames(String... className) {
        Class<?>[] classes = new Class[className.length];
        try {
            for (int i = 0; i < classes.length; i++) {
                classes[i] = Class.forName(className[i]);
            }
            runTestInClassByNames(classes);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void runTestInClassByPackageNames(String packageName) {
        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(DiscoverySelectors.selectPackage(packageName))
                .build();

        launcher.execute(request, listener);

        printData(listener);
    }
}