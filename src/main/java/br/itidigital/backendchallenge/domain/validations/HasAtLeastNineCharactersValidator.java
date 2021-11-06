package br.itidigital.backendchallenge.domain.validations;

import br.itidigital.backendchallenge.domain.model.PasswordModel;

public class HasAtLeastNineCharactersValidator implements IValidations {

	@Override
	public boolean isValid(final PasswordModel passwordModel) {
		return passwordModel.getPassword().length() >= 9;
	}

}
