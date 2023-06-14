package su.fantasy.parameterhandlers.definitions;

import su.fantasy.parameterhandlers.ParameterMethodHandler;

import java.util.List;

public interface ParameterDefinition{

    void mergeMethods(ParameterMethodHandlersDefinition parameterMethodHandlersDefinition);

    List<? extends ParameterMethodHandler> getHandlers();

}
