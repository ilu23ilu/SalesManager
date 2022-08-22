public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public long cutAverage(){
        long sumSales = 0;
        long maxSales = -1;
        long minSales = sales[0];
        for (long sale : sales) {
            if (sale < minSales) {
                minSales = sale;
            }
            sumSales += sale;
        }
        return (sumSales - maxSales - minSales)/(sales.length - 2);
    }
}
