package com.project.ManyToOneMapping.service;

import com.project.ManyToOneMapping.model.Account;
import com.project.ManyToOneMapping.model.Branch;
import com.project.ManyToOneMapping.repository.AccountRepository;
//import com.project.ManyToOneMapping.repository.BranchRepository;
import com.project.ManyToOneMapping.repository.BranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){

        this.accountRepository = accountRepository;
    }

    @Autowired
    private BranchRepo branchRepo;
    public Account getAccount(String accountNumber){
        return  accountRepository.findAccount(accountNumber);

    }

    public void deleteById(Long id) {
        branchRepo.deleteById(id);
    }




}

//    public BranchService(BranchRepository branchRepository) {
//        this.branchRepository = branchRepository;
//    }
//
//    public Branch getBranch(Branch branch) {
//        return branchRepository.save(branch);
//    }
//
//    public Branch findById(Long id) {
//        return branchRepository.findById(id).get();
//    }
//
//    public void update(Branch branch) {
//         branchRepository.save(branch);
//    }
//


