package br.itidigital.backendchallenge.domain.validations;


import br.itidigital.backendchallenge.domain.model.PasswordModel;

public class HasLowerCaseValidator implements IValidations {

	@Override
	public boolean isValid(final PasswordModel passwordModel) {

		final String oneLower = "^(?=.*[a-z]).*$";

		return passwordModel.getPassword().matches(oneLower);
	}

}
