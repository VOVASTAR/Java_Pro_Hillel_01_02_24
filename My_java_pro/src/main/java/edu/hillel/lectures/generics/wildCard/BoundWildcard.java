package edu.hillel.lectures.generics.wildCard;

class BoundWildcard {
    public static void main(String[] args) {
        Car car = new Car();
        Toyota toyota = new Toyota();
        BMW bmw = new BMW();
        Corolla corolla = new Corolla();

        car = toyota;
        toyota = (Toyota) car;


        Garage<? extends Toyota> toyotaGarageE = new Garage<Corolla>();
        Garage<? super Toyota> toyotaGarageS = new Garage<Car>();

//        toyotaGarageE.SetT(new Toyota());
        Toyota t = toyotaGarageE.getT();
        toyotaGarageS.SetT(new Toyota());
        Object t1 = toyotaGarageS.getT();
    }
}

class Car {
}

class Toyota extends Car {
}

class BMW extends Car {
}

class Corolla extends Toyota {
}

class Garage<T> {
    T t;

    public T getT() {
        return t;
    }

    public void SetT(T t) {
        this.t = t;
    }
}