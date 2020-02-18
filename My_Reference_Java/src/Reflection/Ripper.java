package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ripper {


    public static void main(String[] args) throws IllegalAccessException {
        Rabbit rabbit = new Rabbit();
//        showClassName(rabbit);
//        showClassFields(rabbit);
//        showClassMethods(rabbit);
//        showMethodsAnnotation(rabbit);
//        showFieldsAnnotation(rabbit);
        System.out.println(rabbit.getName());
        fillPrivateFields(rabbit);
        System.out.println(rabbit.getName());
    }

    public static void showClassName(Object o) {
        Class clazz = o.getClass();
        System.out.println(clazz.getName());
    }

    public static void showClassFields(Object o) {
        Class clazz = o.getClass();
        Field[] privateFields = clazz.getDeclaredFields();
        for (int i = 0; i < privateFields.length; i++) {
            System.out.println(privateFields[i].getName());
        }
    }

    public static void showClassMethods(Object o) {
        Class clazz = o.getClass();
        Method[] privateMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < privateMethods.length; i++) {
            System.out.println(privateMethods[i].getName());
        }
    }

    public static void showMethodsAnnotation(Object o) {
        Class clazz = o.getClass();
        Method[] privateMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < privateMethods.length; i++) {
            Annotation[] annotations = privateMethods[i].getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(privateMethods[i] + " : " + annotation.toString());
            }
        }
    }

    public static void showFieldsAnnotation(Object o) {
        Class clazz = o.getClass();
        Field[] privateFields = clazz.getDeclaredFields();
        for (int i = 0; i < privateFields.length; i++) {
            Annotation[] annotations = privateFields[i].getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(privateFields[i] + " : " + annotation.toString());
            }
        }
    }

    static void fillPrivateFields(Object o) throws IllegalAccessException {
        Class clazz = o.getClass();
        Field[] privateFields = clazz.getDeclaredFields();
        for (Field field : privateFields) {
            Annotation annotation = field.getAnnotation(RabbitAnnotation.class);
            if (annotation == null) continue;
            field.setAccessible(true);
            field.set(o, "Baks");
            field.setAccessible(false);
        }
    }
    static  Object createNewObject(Object o) throws IllegalAccessException, InstantiationException {
        Class clazz = o.getClass();
        return clazz.newInstance();
    }
}
