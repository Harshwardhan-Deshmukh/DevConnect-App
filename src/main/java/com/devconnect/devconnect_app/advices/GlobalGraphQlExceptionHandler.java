package com.devconnect.devconnect_app.advices;

import com.devconnect.devconnect_app.exception.ResourceNotFoundException;
import graphql.GraphQLError;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.List;

@ControllerAdvice
public class GlobalGraphQlExceptionHandler {

    @GraphQlExceptionHandler(ResourceNotFoundException.class)
    public GraphQLError handleResourceNotFound(ResourceNotFoundException exception) {
        return GraphQLError.newError()
                .message(exception.getMessage())
                .build();
    }

    @GraphQlExceptionHandler(RuntimeException.class)
    public GraphQLError handleRuntimeException(RuntimeException exception) {
        return GraphQLError.newError()
                .message(exception.getMessage())
                .build();
    }

    @GraphQlExceptionHandler(MethodArgumentNotValidException.class)
    public GraphQLError handleValidationException(MethodArgumentNotValidException exception) {
        List<String> errors = exception.getBindingResult()
                .getAllErrors()
                .stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .toList();
        String errorResult = String.join(", ", errors);

        return GraphQLError.newError()
                .message(errorResult)
                .build();
    }

    @GraphQlExceptionHandler(Exception.class)
    public GraphQLError handleInternalServerError(Exception exception) {
        return GraphQLError.newError()
                .message(exception.getMessage())
                .build();
    }
}
