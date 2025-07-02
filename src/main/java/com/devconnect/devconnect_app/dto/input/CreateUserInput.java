package com.devconnect.devconnect_app.dto.input;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateUserInput {
    @NotBlank(message = "User: name is an Required Field for performing Mutations")
    private String name;
    @NotBlank(message = "User: email is an Required Field for performing Mutations")
    private String email;
    private String bio;
}
