package com.devconnect.devconnect_app.advices;

import com.devconnect.devconnect_app.exception.ResourceNotFoundException;
import graphql.GraphQLError;
import org.springframework.graphql.data.method.annotation.GraphQlExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalGraphQlExceptionHandler {

    @GraphQlExceptionHandler(ResourceNotFoundException.class)
    public GraphQLError handleResourceNotFound(ResourceNotFoundException exception) {
        return GraphQLError.newError()
                .message(exception.getMessage())
                .build();
    }
}
