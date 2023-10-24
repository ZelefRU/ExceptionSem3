package org.example;

import java.io.File;
import java.io.IOException;

//        3. Создайте класс исключения, которое будет возникать при попытке открыть
//        несуществующий файл. Исключение должно отображать понятное для
//        пользователя сообщение об ошибке.

public class IOTask extends IOException {

    public static void main(String[] args) throws IOTask {
        openFile(new File("asd.exe"));
    }

    public IOTask(String e) {
        super(e);
    }

    public static void openFile(File file) throws IOTask {
        if (!file.exists()) {
            throw new IOTask("Файла не существует");
        }
    }
}
