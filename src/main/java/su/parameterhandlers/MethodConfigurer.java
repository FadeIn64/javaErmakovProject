package su.parameterhandlers;

public interface MethodConfigurer {

    <E> ParameterMethodHandlersConfigurer<E> parameterType(Class<E> parameterType);

    ControllerParameterHandlersChain and();

}
