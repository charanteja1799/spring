package com.example.exportexcel.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface TransactionService {

    void importToDb(List<MultipartFile> multipartfiles);

}
