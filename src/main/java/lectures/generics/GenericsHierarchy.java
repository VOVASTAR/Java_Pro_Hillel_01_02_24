package lectures.generics;

class GenericsHierarchy<U> {
    public U ob;

    interface GenericInterface<X> { }
    class MainGenerics { }
    class GenParent<T> extends MainGenerics { }
    class Child extends GenParent { }
    class Child2 extends GenParent<String> { }
    class Child3<T> extends GenParent<T> { }
    class Child4<X, T> extends GenParent<T> { }
    class Child5<X, T> extends GenParent { }
    class Child6<X, T> extends Child5<Integer, T> { }
    class One<T> implements GenericInterface<T> { }
    class Two implements GenericInterface<String> { }
}
