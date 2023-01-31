package com.project.ManyToOneMapping.repository;

import com.project.ManyToOneMapping.model.Account;
import com.project.ManyToOneMapping.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query("select a from Account a where a.accountNumber = ?1")
    public Account findAccount(String accountNumber);


}
