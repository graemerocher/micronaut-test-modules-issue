package foo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
class FooTest {

    @Inject
    Foo foo;

    @Test
    void testInjectedFooIsNotNull() {
        assertNotNull(foo);
    }
}
