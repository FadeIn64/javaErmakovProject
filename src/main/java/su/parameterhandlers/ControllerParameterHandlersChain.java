package su.parameterhandlers;

public interface ControllerParameterHandlersChain {

    <T> AnnotatedMethodConfigurer<T> annotatedMethods(Class<T> annotation);

    ControllerParameterHandlersChain and();

}
