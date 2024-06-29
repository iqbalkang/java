package Generics.Dheeru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericDemo <T extends List> {
    public static void main(String[] args) {

        Container<String> stringStore = new Store<>();
        stringStore.set("java");
        System.out.println(stringStore.get());

        Container<Integer> integerStore = new Store<>();
        integerStore.set(1);
        System.out.println(integerStore.get());

        Container<List<Integer>> listStore = new Store<>();
        listStore.set(Arrays.asList(2, 4, 1, 5, 7));
        System.out.println(listStore.get());

        GenericDemo<ArrayList> gd = new GenericDemo<>();
    }

    public void go(T list) {
        list.add(1);
    }

}

interface Container<T> {
    void set(T a);
    T get();
}

class Store<T> implements Container<T> {
    private T a;

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }
}
