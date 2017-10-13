```
> ./gradlew :generateJpaMetaModel --stacktrace

> Task :generateJpaMetaModel
Note: Hibernate JPA 2 Static-Metamodel Generator 5.2.11.Final


FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':generateJpaMetaModel'.
> java.lang.ClassCastException: com.sun.tools.javac.code.Symbol$TypeVariableSymbol cannot be cast to javax.lang.model.element.TypeElement

* Try:
Run with --info or --debug option to get more log output.

* Exception is:
org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':generateJpaMetaModel'.
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:100)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:70)
        at org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter.execute(SkipUpToDateTaskExecuter.java:62)
        at org.gradle.api.internal.tasks.execution.ResolveTaskOutputCachingStateExecuter.execute(ResolveTaskOutputCachingStateExecuter.java:54)
        at org.gradle.api.internal.tasks.execution.ValidatingTaskExecuter.execute(ValidatingTaskExecuter.java:58)
        at org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter.execute(SkipEmptySourceFilesTaskExecuter.java:97)
        at org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecuter.java:87)
        at org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter.execute(ResolveTaskArtifactStateTaskExecuter.java:52)
        at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:52)
        at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:54)
        at org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter.execute(ExecuteAtMostOnceTaskExecuter.java:43)
        at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:34)
        at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker$1.run(DefaultTaskGraphExecuter.java:248)
        at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:336)
        at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:328)
        at org.gradle.internal.progress.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:199)
        at org.gradle.internal.progress.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:110)
        at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker.execute(DefaultTaskGraphExecuter.java:241)
        at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker.execute(DefaultTaskGraphExecuter.java:230)
        at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.processTask(DefaultTaskPlanExecutor.java:123)
        at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.access$200(DefaultTaskPlanExecutor.java:79)
        at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:104)
        at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:98)
        at org.gradle.execution.taskgraph.DefaultTaskExecutionPlan.execute(DefaultTaskExecutionPlan.java:625)
        at org.gradle.execution.taskgraph.DefaultTaskExecutionPlan.executeWithTask(DefaultTaskExecutionPlan.java:580)
        at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.run(DefaultTaskPlanExecutor.java:98)
        at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
        at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46)
        at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
Caused by: java.lang.RuntimeException: java.lang.ClassCastException: com.sun.tools.javac.code.Symbol$TypeVariableSymbol cannot be cast to javax.lang.model.element.TypeElement
        at com.sun.tools.javac.main.Main.compile(Main.java:553)
        at com.sun.tools.javac.api.JavacTaskImpl.doCall(JavacTaskImpl.java:129)
        at com.sun.tools.javac.api.JavacTaskImpl.call(JavacTaskImpl.java:138)
        at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:49)
        at org.gradle.api.internal.tasks.compile.JdkJavaCompiler.execute(JdkJavaCompiler.java:36)
        at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.delegateAndHandleErrors(NormalizingJavaCompiler.java:99)
        at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:52)
        at org.gradle.api.internal.tasks.compile.NormalizingJavaCompiler.execute(NormalizingJavaCompiler.java:37)
        at org.gradle.api.internal.tasks.compile.CleaningJavaCompilerSupport.execute(CleaningJavaCompilerSupport.java:35)
        at org.gradle.api.internal.tasks.compile.CleaningJavaCompilerSupport.execute(CleaningJavaCompilerSupport.java:25)
        at org.gradle.api.tasks.compile.JavaCompile.performCompilation(JavaCompile.java:204)
        at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:189)
        at org.gradle.api.tasks.compile.JavaCompile.compile(JavaCompile.java:121)
        at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:73)
        at org.gradle.api.internal.project.taskfactory.DefaultTaskClassInfoStore$IncrementalTaskAction.doExecute(DefaultTaskClassInfoStore.java:179)
        at org.gradle.api.internal.project.taskfactory.DefaultTaskClassInfoStore$StandardTaskAction.execute(DefaultTaskClassInfoStore.java:135)
        at org.gradle.api.internal.project.taskfactory.DefaultTaskClassInfoStore$StandardTaskAction.execute(DefaultTaskClassInfoStore.java:122)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$1.run(ExecuteActionsTaskExecuter.java:121)
        at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:336)
        at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:328)
        at org.gradle.internal.progress.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:199)
        at org.gradle.internal.progress.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:110)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeAction(ExecuteActionsTaskExecuter.java:110)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:92)
        ... 28 more
Caused by: java.lang.ClassCastException: com.sun.tools.javac.code.Symbol$TypeVariableSymbol cannot be cast to javax.lang.model.element.TypeElement
        at org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor$ContainsAttributeTypeVisitor.visitDeclared(JPAMetaModelEntityProcessor.java:297)
        at org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor$ContainsAttributeTypeVisitor.visitDeclared(JPAMetaModelEntityProcessor.java:277)
        at com.sun.tools.javac.code.Type$ClassType.accept(Type.java:944)
        at org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor.modelGenerationNeedsToBeDeferred(JPAMetaModelEntityProcessor.java:193)
        at org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor.createMetaModelClasses(JPAMetaModelEntityProcessor.java:161)
        at org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor.process(JPAMetaModelEntityProcessor.java:135)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment.callProcessor(JavacProcessingEnvironment.java:794)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment.discoverAndRunProcs(JavacProcessingEnvironment.java:705)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment.access$1800(JavacProcessingEnvironment.java:91)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment$Round.run(JavacProcessingEnvironment.java:1035)
        at com.sun.tools.javac.processing.JavacProcessingEnvironment.doProcessing(JavacProcessingEnvironment.java:1176)
        at com.sun.tools.javac.main.JavaCompiler.processAnnotations(JavaCompiler.java:1170)
        at com.sun.tools.javac.main.JavaCompiler.compile(JavaCompiler.java:856)
        at com.sun.tools.javac.main.Main.compile(Main.java:523)
        ... 51 more


* Get more help at https://help.gradle.org

BUILD FAILED in 0s
1 actionable task: 1 executed
```
