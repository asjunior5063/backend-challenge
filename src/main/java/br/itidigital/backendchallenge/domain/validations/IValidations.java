package br.itidigital.backendchallenge.domain.validations;

import br.itidigital.backendchallenge.domain.model.PasswordModel;

public interface IValidations {
    boolean isValid(final PasswordModel passwordModel);
}
