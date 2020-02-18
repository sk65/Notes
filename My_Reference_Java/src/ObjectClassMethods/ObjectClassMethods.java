package ObjectClassMethods;

public class ObjectClassMethods {
    public static void main(String[] args) {
        Object object = new Object();
        object.notifyAll();       // будит все протоки которые находятся в wait
        object.notify();          // будит один поток который находятся в wait

        //https://www.youtube.com/watch?v=ZcZQEqxmjOQ
        //Для оптимизации производительности при сравнении объектов используется метод hashCode().
        // Метод hashCode() возвращает уникальный идентификатор для каждого объекта, что упрощает сравнение состояний объектов.
        object.hashCode();       // вспомогательнвй метод котолрый позволяет грубо оценить равны
                                 // объекты или нет,они возможно равны или не равны точно.
        object.equals(object);   // сравнивает объекты
        object.toString();       // возращяет строковое представление объекта
        object.getClass();       // возвращает объект класа
        //object.wait();         //отправляет поток в ожидание пока его не разбудят
    }
}
