package org.example;
//        Создайте класс Счетчик, у которого есть метод add(), увеличивающий
//        значение внутренней int переменной на 1.Сделайте так, чтобы с объектом
//        такого типа можно было работать в блоке try-with-resources. Нужно бросить
//        исключение, если работа с объектом типа счетчик была не в ресурсном try
//        и/или ресурс остался открыт. Подумайте какой тип исключения подойдет
//        лучше всего.
public class Counter implements AutoCloseable {

    public static void main(String[] args) {
        Counter counter = new Counter();
//        counter.close();

        Thread asd = new Thread(() -> {
            System.out.println("test");
        });
        asd.start();

        try {

            System.out.println(counter.getCount());
            counter.add();
            counter.add();
            System.out.println(counter.getCount());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        while (true) {
            if (counter.getCount() == 1) {
                break;
            }
        }
        System.out.println(counter.getCount());


    }

    protected Integer count = 0;
    protected boolean close = false;


    public void add() {
        setCount(getCount() + 1);
    }

    public int getCount() {
//        if (count == null) {
//            throw new RuntimeException("Увы и ах");
//        }
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void close() {
        count = null;
    }
}
