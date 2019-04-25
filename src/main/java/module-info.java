module micronaut.test.modules.issue {
    exports foo;
    requires javax.inject;
    opens foo to io.micronaut.inject;
}
