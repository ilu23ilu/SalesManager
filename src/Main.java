public class Main {
    public static void main(String[] args) {
        long [] sales = {25, 76, 78, 88};
        SalesManager box = new SalesManager(sales);
        box.max();
        System.out.println(box.max());
        System.out.println(box.cutAverage());
    }
}
