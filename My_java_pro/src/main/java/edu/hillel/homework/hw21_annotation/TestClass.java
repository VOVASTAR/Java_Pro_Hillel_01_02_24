package edu.hillel.homework.hw21_annotation;

public class TestClass {

    @BeforeSuite
    public void before() {
        System.out.println("Before work");
    }

    @AfterSuite
    public void after() {
        System.out.println("After work");
    }

    @Test(priority = 7)
    public void test1() {
        System.out.println("test 1 work");
    }

    @Test(priority = 3)
    public void test2() {
        System.out.println("test 2 work");
    }

    @Test
    public void test3() {
        System.out.println("test 3 work");
    }

    @Test(priority = 7)
    public void test4() {
        System.out.println("test 4 work");
    }
}
