package su.fantasy.parameterhandlers.congigurer;

import su.fantasy.parameterhandlers.ParameterMethodHandler;

public interface ParameterMethodHandlersConfigurer<T> {
    ParameterMethodHandlersConfigurer<T> addHandler(ParameterMethodHandler<T> handler);
    MethodConfigurer and();
}
