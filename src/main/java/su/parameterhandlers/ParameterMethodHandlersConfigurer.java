package su.parameterhandlers;

public interface ParameterMethodHandlersConfigurer<T> {
    ParameterMethodHandlersConfigurer<T> addHandler(ParameterMethodHandler<T> handler);
    MethodConfigurer and();
}
