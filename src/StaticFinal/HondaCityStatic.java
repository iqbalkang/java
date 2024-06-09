package StaticFinal;

class HondaCity {
    static long price = 10;
    int a, b;

    public static double onRoadPrice() {
        return price * 0.01;
    }

    public static void print() {
        System.out.println(onRoadPrice());
    }

}

public class HondaCityStatic {

    public static void main(String[] args) {
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();

        System.out.println(h1.price);
        HondaCity.print();
    }
}
