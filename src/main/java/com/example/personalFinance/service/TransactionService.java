package com.example.personalFinance.service;

import com.example.personalFinance.model.Transaction;
import com.example.personalFinance.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction saveTransaction(Transaction newTransaction) {
        return transactionRepository.save(newTransaction);
    }
}
