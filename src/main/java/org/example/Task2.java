package org.example;

import java.io.IOException;

//  Создайте метод doSomething(), который может быть источником одного из
//        типов checked exceptions (тело самогометода прописывать не обязательно).
//        Вызовите этот метод из main и обработайте в нем исключение, которое
//        вызвалметод doSomething().
public class Task2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("Метод doSomething вылетел с ошибкой " + e.getMessage());

        }

    }

    public static void doSomething() throws IOException {
        throw new IOException("CustomMessage");
    }

}
