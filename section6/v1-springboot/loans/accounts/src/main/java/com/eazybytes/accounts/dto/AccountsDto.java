package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account Information"
)
public class AccountsDto {

    @Schema(
            description = "Account number of the EazyBank account"
    )
    @NotEmpty(message = "account number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "account number must be of 10 digits")
    private Long accountNumber;

    @Schema(
            description = "account type of the EazyBank account", example = "Current"
    )
    @NotEmpty(message = "account type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "branch address of the EazyBank"
    )
    @NotEmpty(message = "branch address cannot be null or empty")
    private String branchAddress;
}