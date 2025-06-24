package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity

// not required as class name matches with the table name into the database @Table(name = "Customer")

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id") // not needed as customer_id and customer_Id both are same
    private Long customerId;

    private String name;

    private String email;

    private String mobileNumber;
}
