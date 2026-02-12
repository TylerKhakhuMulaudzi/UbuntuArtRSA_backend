package com.ubuntuartsa.backend.dto;

import  com.ubuntuartsa.backend.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
public class RegisterRequest {

    @NotBlank(message = "Email is required")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^\\+?27[0-9]{9}$",message = "Phone")
    private String phoneNumber;

    @NotBlank(message = "Password is required")
    @Size(min = 8,message = "Password must be at leat 8 charaters long")
    private  String password;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message =  "Last name is required")
    private String lastName;

    private String saIdNumber;

    @NotBlank(message = "Role is required")
    private String role;

}
