# Анализ статистики продаж


## Программа анализирует статистику продаж за определенный период времени и выводит максимальную прибыль на экран
##


### *Метод для определения максимального значения в классе SalesManager, в поле которого массив цифр, и конструктор с параметром в виде массива:*
```
protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }
public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
```
### *В классе Main происходит демонстрация работы класса SalesManager:* 
```
 public static void main(String[] args) {
        int [] sales = {25, 76, 78, 88};
        SalesManager box = new SalesManager(sales);
        box.max();
        System.out.println(box.max());
    }
```
