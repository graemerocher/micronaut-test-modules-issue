package foo;

import io.micronaut.context.ApplicationContext;

public class Main {
    public static void main(String... args) {
        ApplicationContext.run()
                          .getBean(Foo.class);
    }
}
