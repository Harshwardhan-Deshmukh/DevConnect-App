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
public class UpdateTagInput {
    @NotBlank(message = "Tag: id is an Required Field for performing Mutations")
    private Integer id;
    private String name;
}
