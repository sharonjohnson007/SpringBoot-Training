package com.project.ManyToOneMapping.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String branchCode;
    String branchName;
    @OneToMany(orphanRemoval = true)
    private Set<Account> account;
}