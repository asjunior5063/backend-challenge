package br.itidigital.backendchallenge.domain;

import br.itidigital.backendchallenge.domain.model.PasswordModel;

public interface IValidationPasswordService {

    boolean isValid(PasswordModel passwordModel);
}
