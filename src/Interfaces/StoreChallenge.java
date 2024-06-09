package Interfaces;

import java.util.Arrays;

interface Member {
    void call();
}

class Customer implements Member {
    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("calling " + name);
    }

    public void customerMethod() {
        System.out.println("customer method");
    }
}

class Store {
    Member[] customers = new Customer[5];
    int count = 0;

    public void RegisterMember(Customer customer) {
        customers[count] = customer;
        count++;
    }

    void saleInvite() {

        for(int i = 0; i < count; i++) {
            customers[i].call();
//            customers[i].customerMethod();
        }
    }

}

public class StoreChallenge {

    public static void main(String[] args) {
        Customer c1 = new Customer("bala");
        Customer c2 = new Customer("jeeto");
//        Customer c3 = new Customer("abhi");
//        Customer c4 = new Customer("prince");
//        Customer c5 = new Customer("vicky");

        Store store = new Store();
        store.RegisterMember(c1);
        store.RegisterMember(c2);
//        store.RegisterMember(c3);
//        store.RegisterMember(c4);
//        store.RegisterMember(c5);

        store.saleInvite();

    }

}
