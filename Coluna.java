import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) // Annotation para atributos
public @interface Coluna {
    String nome(); // Nome da coluna
}
