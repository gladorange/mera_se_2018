package anoshkin.home9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
public @interface AnimalHeader {
    String typeField() default "animal";
    String typeName();
    String descriptionField() default "description";
    String description();
    String nameField() default "name";
    String parameterField();
}
