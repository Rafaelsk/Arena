package generics;

/**
 * User: rafael
 * Date: 10/24/13
 * Time: 9:58 PM
 */
// This program shows how to use generics in your programs

class PairOfT<T> {

    T object1;
    T object2;

    PairOfT(T one, T two) {
        object1 = one;
        object2 = two;
    }

    public T getFirst() {
        return object1;
    }

    public T getSecond() {
        return object2;
    }

    public static void main(String[] args) {
        PairOfT<String> worldCup = new PairOfT<String>("2010", "South Africa");
    }
}

