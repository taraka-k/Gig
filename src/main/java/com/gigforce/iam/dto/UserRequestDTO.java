package com.gigforce.iam.dto;

import com.gigforce.iam.entity.Role;
import com.gigforce.iam.entity.Status;
import jakarta.validation.constraints.*;

import lombok.Data;

@Data
public class UserRequestDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @Email
    @NotBlank(message = "Email is required")
    private String email;

    @Pattern(regexp = "^[0-9]{10}$")
    private String phone;

    @NotBlank
    @Size(min = 6)
    private String password;

    @NotNull
    private Role role;

    @NotNull
    private Long orgUnitId;

    @NotNull
    private Status status;

}