package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Schema(
        name = "Customer",
        description = "Schema to hold Customer & Account information"
)
@Data
public class CustomerDto {

    @Schema(
            description = "name of the customer", example = "Deepak Soam"
    )
    @NotEmpty(message = "name cannot be null or empty")
    @Size(min=5,max=30, message = "The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(
            description = "email of the customer", example = "deepak@example.com"
    )
    @NotEmpty(message = "name cannot be null or empty")
    @Email(message = "provide the value in a email format")
    private String email;

    @Schema(
            description = "mobile number of the customer", example = "9634280000"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "mobile number must be of 10 digits")
    private String mobileNumber;

    @Schema(
            description = "account details of the account"
    )
    private AccountsDto accountsDto;
}
