import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // Annotation para classes
public @interface Tabela {
    String nome();
}
