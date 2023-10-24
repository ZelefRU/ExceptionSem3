package org.example.MatrixTask;

//    1. Напишите метод, на вход которого подаётся двумерный строковый массив
//    размером 4х4. При подаче массива другого размера необходимо бросить
//    исключение MyArraySizeException.

//    2. Далее метод должен пройтись по всем элементам массива, преобразовать в
//    int и просуммировать. Если в каком-то элементе массива преобразование
//    не удалось (например, в ячейке лежит символ или текст вместо числа),
//    должно быть брошено исключение MyArrayDataException с детализацией, в
//    какой именно ячейке лежат неверные данные.

//    3. В методе main() вызвать полученный метод, обработать возможные
//    исключения MyArraySizeException и MyArrayDataException и вывести
//    результат расчета (сумму элементов, при условии, что подали на вход
//    корректный массив).

public class MatrixArrayTasks {

    public static void main(String[] args) {
        String[][] strings = {
                {"1", "2", "5", "1"},
                {"1", "5", "5", "1"},
                {"1", "2", "1", "asd"},
                {"6", "1", "12", "33"},};

        System.out.println(matrixParseInt(strings));
    }

    public static int matrixParseInt(String[][] strings) {
        if (strings.length == 4 && strings[1].length == 4) {
            int sum = 0;
            for (int i = 0; i < strings[0].length; i++) {
                for (int j = 0; j < strings[1].length; j++) {
                    try {
                        int temp = Integer.parseInt(strings[i][j]);
                        sum += temp;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(String.format("""
                                Была вызвана ошибка MyArraySizeException.
                                в строке %d и в столбце %d
                                """, i, j));
                    }
                }
            }
            return sum;
        } else {
            throw new MyArraySizeException("Размер массива не равен 4!");
        }
    }


}
