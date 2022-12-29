package com.example.exportexcel.controller;

import com.example.exportexcel.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(path = "/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    public void setTransactionService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping(path = "/import-to-db")
    public void importTransactionsFromExcelToDb(@RequestParam("file") List<MultipartFile> files) {

        transactionService.importToDb(files);

    }
    @GetMapping(path = "/test")
    public String test(){
        return "Hello Charan";
    }
}
