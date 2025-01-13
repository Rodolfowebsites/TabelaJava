
import java.lang.reflect.Field;

public class AnnotationProcessor {
    public static void processarTabela(Class<?> clazz) {
        // Verifica se a classe possui a annotation @Tabela
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation((Tabela.class));
            System.out.println("Tabela: " + tabela.nome());

            // Verifica os campos e busca as annotations @Coluna
            Field[] campos = clazz.getDeclaredFields();
            for (Field campo : campos) {
                if (campo.isAnnotationPresent(Coluna.class)) {
                    Coluna coluna = campo.getAnnotation(Coluna.class);
                    System.out.println(" - Coluna: " + coluna.nome() + " (Tipo: " + campo.getType().getSimpleName() + ")");
                }
            }
        } else {
            System.out.println("A classe " + clazz.getSimpleName() + " não está anotada com @Tabela.");
        }
    }
}
