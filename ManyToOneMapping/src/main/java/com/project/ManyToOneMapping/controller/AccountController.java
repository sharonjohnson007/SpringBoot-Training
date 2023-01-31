package com.project.ManyToOneMapping.controller;

import com.project.ManyToOneMapping.model.Account;
import com.project.ManyToOneMapping.service.AccountService;
//import com.project.ManyToOneMapping.service.BranchService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private AccountService accountService;

    public AccountController(AccountService accountService) {

        this.accountService = accountService;
    }

    @GetMapping(path = "/accounts/{accountNumber}")
    public Account getAccount(@PathVariable("accountNumber") String accountNumber) {
        return accountService.getAccount(accountNumber);
    }

    @DeleteMapping(path = "/branch/{id}")
    public  void delBranch(@PathVariable("id") Long id){
        accountService.deleteById(id);
    }

}