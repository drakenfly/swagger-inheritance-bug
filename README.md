Irecently discovered a bug in Swagger-Core affecting object property resolution. As far as I could debug, it is related to a short circuit in object traversal to prevent StackOverflows - see ModelResolver:394.

I could obersve the problem for two objects with a cyclic dependency on each other, whilst sharing a common base type and forcing the OpenAPI generator to traverse the object tree in a specific order using the allOf attribute.

Performing a `mvn clean install` in the root of the project will generate an OpenAPI spec in `api/target/generatedtest/openapi.[json|yaml]`.

This spec contains an object called `PortfolioViewDto` that should contain a list of `DepotViewDto`, which is missing. Navigating to `api/src/main/java/rest/TestEndpoint.java` and uncommenting the additional methods (and importing the DTOs of course) will lead to a correct generation of the spec file, as the order of traversal changes with the additional methods.
