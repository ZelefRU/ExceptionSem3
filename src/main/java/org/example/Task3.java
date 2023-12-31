package org.example;


//Задание №3
//        1. Создайте класс исключения, который будет выбрасываться при делении на 0.
//        Исключение должно отображать понятное для пользователя сообщение
//        об ошибке.

//        2. Создайте класс исключений, которое будет возникать при обращении к
//        пустому элементу в массиве ссылочного типа. Исключение должно
//        отображать понятное для пользователя сообщение об ошибке

//        3. Создайте класс исключения, которое будет возникать при попытке открыть
//        несуществующий файл. Исключение должно отображать понятное для
//        пользователя сообщение об ошибке.

public class Task3 extends RuntimeException {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        division(a,b);

    }

    public static void division(int a, int b) {
        if (b == 0) {
            throw new Task3("Деление на 0 невозможно");
        } else {
            System.out.println(a/b);
        }
    }

    public Task3(String e) {
        super(e);
    }

}
