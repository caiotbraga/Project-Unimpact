package com.example.Unimpact.Controllers;

import com.example.Unimpact.Dtos.ContribuinteExternoDto;
import com.example.Unimpact.Models.ContribuinteExterno;
import com.example.Unimpact.Repositories.ContribuinteExternoRepository;
import com.example.Unimpact.Services.ContribuinteExternoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/cadastroContribuinteExterno")
public class ContribuinteExternoController {

//    @Autowired
//    private ContribuinteExternoRepository repos;

    final ContribuinteExternoService contribuinteExternoService;

    public ContribuinteExternoController(ContribuinteExternoService contribuinteExternoService) {
        this.contribuinteExternoService = contribuinteExternoService;
    }

    @PostMapping
    public ResponseEntity<ContribuinteExterno> createContribuinteExterno(@Valid @RequestBody ContribuinteExternoDto contribuinteDTO) throws InvocationTargetException, IllegalAccessException {
        var contribuinteExternoModel = new ContribuinteExterno();
        BeanUtils.copyProperties(contribuinteDTO, contribuinteExternoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(contribuinteExternoService.save(contribuinteExternoModel));
    }
}
