// Create controller class with restcontroller and requestmapping annotations
// add get, post, delete, and put methods along with proper arguments for user input data, i.e. @requestbody, @pathvariable, var+type
// DO NOT instantiate entity/repository objects here
// Implement/use any interface/class in port.in/application.domain.service if needed.
// No DB operations here!

package com.nkh1987.pfm.adapter.in.web;

import com.nkh1987.pfm.adapter.out.persistence.AccountEntity;
import com.nkh1987.pfm.adapter.out.persistence.TransactionEntity;
import com.nkh1987.pfm.adapter.out.persistence.AccountRepository;
import com.nkh1987.pfm.adapter.out.persistence.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

    // mappings to work with DB
    // DB is linked with repos/entities like account
    // methods: save, findAll, findById, put, delete
    // to communicate with browser --> http --> ResponseEntity
    @Autowired
    private AccountRepository accountRepository;


    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/accounts")
    public List<AccountEntity> getAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/transactions_report")
    public List<TransactionEntity> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @PostMapping("/add_transaction")
    public TransactionEntity addTransaction(@RequestBody TransactionEntity transactionEntity) {
        return transactionRepository.save(transactionEntity);
    }

}
