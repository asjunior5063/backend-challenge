package br.itidigital.backendchallenge.domain.service;

import br.itidigital.backendchallenge.domain.IValidationPasswordService;
import br.itidigital.backendchallenge.domain.model.PasswordModel;
import br.itidigital.backendchallenge.domain.validations.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
@Slf4j
public class ValidationPasswordService implements IValidationPasswordService {
    @Override
    public boolean isValid(final PasswordModel passwordModel) {
        Optional<IValidations> found = Stream
                .of(new HasAtLeastNineCharactersValidator(),
                        new HasAtLeastOneDigit(),
                        new HasLowerCaseValidator(),
                        new HasNoBlankSpace(),
                        new HasNoRepetingSpecialCharacters(),
                        new HasSpecialCharactersValidator(),
                        new HasUpperCaseValidator())
                .filter(a -> !a.isValid(passwordModel)).findFirst();

        return found.isEmpty();
    }
}
