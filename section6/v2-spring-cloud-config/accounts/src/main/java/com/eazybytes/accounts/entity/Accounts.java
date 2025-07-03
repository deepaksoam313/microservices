package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity

// not required as class name matches with the table name into the database @Table(name = "Customer")

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Accounts extends BaseEntity {

    @Column(name="customer_id")
    private Long customerId;

    @Id
    @Column(name="account_number") //Optional
    private Long accountNumber;

    @Column (name="account_type")
    private String accountType;

    @Column (name="branch_address")
    private String branchAddress;
}
