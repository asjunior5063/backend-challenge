package br.itidigital.backendchallenge.api.controller;

import br.itidigital.backendchallenge.api.app.PasswordApp;
import br.itidigital.backendchallenge.api.dto.RequestPasswordDTO;
import br.itidigital.backendchallenge.domain.model.PasswordModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/valida-senha")
@Api(value = "[ /valida-senha ] - API Password Validate", tags = {"Password Validate"})
public class PasswordValidateController {

    @Autowired
    private PasswordApp app;

    @PostMapping
    @ApiOperation(value = "Valida", response = RequestPasswordDTO.class, responseContainer = "RequestPasswordDTO")
    public ResponseEntity<RequestPasswordDTO> validaSenha(@RequestBody PasswordModel password) {

        return ResponseEntity.ok(app.isValid(password));

    }
}
