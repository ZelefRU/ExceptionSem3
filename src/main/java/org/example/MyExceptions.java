package org.example;

//        2. Создайте класс исключений, которое будет возникать при обращении к
//        пустому элементу в массиве ссылочного типа. Исключение должно
//        отображать понятное для пользователя сообщение об ошибке


public class MyExceptions extends NullPointerException {

    public static void main(String[] args) {
        String[] asd = {"asd", "sd", "as"};

        arraySearchElement(asd);
    }

    public MyExceptions(String e) {
        super(e);
    }

    public static void arraySearchElement(String[] s) {
        for (String string : s) {
            if (string == null) {
                throw new MyExceptions("Есть пустой элемент в массиве");
            }
        }
    }
}
