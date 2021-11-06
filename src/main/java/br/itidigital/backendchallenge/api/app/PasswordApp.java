package br.itidigital.backendchallenge.api.app;

import br.itidigital.backendchallenge.api.dto.PasswordConverter;
import br.itidigital.backendchallenge.api.dto.RequestPasswordDTO;
import br.itidigital.backendchallenge.domain.IValidationPasswordService;
import br.itidigital.backendchallenge.domain.model.PasswordModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PasswordApp {

    private final IValidationPasswordService service;

    public RequestPasswordDTO isValid(final PasswordModel model) {

        final PasswordConverter converter = new PasswordConverter();

        return converter.toDTO(model, service.isValid(model));

    }
}
