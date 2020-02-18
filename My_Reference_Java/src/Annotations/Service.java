package Annotations;

import java.lang.annotation.*;

@Documented      // попадает в javadoc
@Inherited       // наследуется потомками
@Target(ElementType.TYPE) //область применения
@Retention(RetentionPolicy.RUNTIME) //Время жизни
public @interface Service {
    String name();

    boolean lazyLood() default false;
}
