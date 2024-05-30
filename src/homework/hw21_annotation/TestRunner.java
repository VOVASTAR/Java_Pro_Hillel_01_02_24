package homework.hw21_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestRunner {

    public static void main(String[] args) {
        start(TestClass.class);
    }

    public static void start(Class<?> clazz) {
        List<Method> methodList = new ArrayList<>();
        Method beforeSuite = null;
        Method afterSuite = null;

        for (Method method : clazz.getDeclaredMethods()) {
            for (Annotation annotation : method.getDeclaredAnnotations()) {
                if (annotation instanceof BeforeSuite) {
                    if (beforeSuite == null) {
                        beforeSuite = method;
                    } else throw new RuntimeException("There are more than 1 beforeSuite");
                }
                if (annotation instanceof Test) {
                    methodList.add(method);
                }
                if (annotation instanceof AfterSuite) {
                    if (afterSuite == null) {
                        afterSuite = method;
                    } else throw new RuntimeException("There are more than 1 afterSuite");
                }
            }
        }

        methodList.sort(Comparator.comparingInt(o -> o.getAnnotation(Test.class).priority()));

        if (beforeSuite != null) {
            methodList.addFirst(beforeSuite);
        }
        if (afterSuite != null) {
            methodList.addLast(afterSuite);
        }

        methodList.forEach(method -> {
            try {
                method.invoke(clazz.getDeclaredConstructor().newInstance());
            } catch (IllegalAccessException | InvocationTargetException | InstantiationException |
                     NoSuchMethodException e) {
                e.printStackTrace();
            }
        });
    }
}

