# Hibernate JPA 2 Static-Metamodel Generator

```
> ./gradlew :generateJpaMetaModel             

> Task :generateJpaMetaModel
Note: Hibernate JPA 2 Static-Metamodel Generator 5.2.11.Final


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':generateJpaMetaModel'.
> java.lang.ClassCastException: com.sun.tools.javac.code.Symbol$TypeVariableSymbol cannot be cast to javax.lang.model.element.TypeElement

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output.

* Get more help at https://help.gradle.org

BUILD FAILED in 0s
1 actionable task: 1 executed
```

See issue: https://hibernate.atlassian.net/browse/HHH-12030
