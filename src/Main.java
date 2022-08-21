public class Main {
    public static void main(String[] args) {
        int [] sales = {25, 76, 78, 88};
        SalesManager box = new SalesManager(sales);
        box.max();
        System.out.println(box.max());
    }
}
