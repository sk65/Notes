package Annotations;

public class Annotations {
    /**
     * @Override указывает на переоприделение метода
     * @Deprecated указывает на устаревший элемент класса
     * @SuppressWarnings("all") запрет кампилятору выводить предупрреждения
     */
    public static void main(String[] args) {
        String s = new String();
        Class clazz = s.getClass();
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(clazz);
    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.name());
        } else {
            System.out.println("Sorry");
        }
    }
}
