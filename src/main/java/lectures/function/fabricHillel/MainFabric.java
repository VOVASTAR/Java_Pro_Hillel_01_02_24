package lectures.function.fabricHillel;

class MainFabric {

    public static void main(String[] args) {
        MainFabric mainFabric = new MainFabric();
        mainFabric.test();
        mainFabric.testPet();
    }

    private static <T> Fabric<T> createFactory(Producer<T> producer, Configuration<T> configuration) {
        return () -> {
            T instance = producer.produce();
            configuration.configure(instance);
            return instance;
        };
/*
        return new Fabric<T>() {
            @Override
            public T create() {
                T instance = producer.produce();
                configuration.configure(instance);
                return instance;
            }
        };
*/
    }

    private void test() {
        Fabric<Integer> test = createFactory(() -> (int) (Math.random() * 100), integer -> {
            integer = integer * 2;
            System.out.println(integer);
        });
        System.out.println(test.create());
    }

    private void testPet() {
        Fabric<Pet> testPet = createFactory(() -> new Pet((int) (100 * Math.random()), "TestPet"), pet -> {
            System.out.println(pet);
            pet.setName(pet.getName() + Math.random());
        });
        System.out.println(testPet.create());
    }
}
