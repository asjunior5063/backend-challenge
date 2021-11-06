package br.itidigital.backendchallenge.domain.validations;

import br.itidigital.backendchallenge.domain.model.PasswordModel;

import java.util.regex.Pattern;

public class HasAtLeastOneDigit implements IValidations {

	@Override
	public boolean isValid(final PasswordModel passwordModel) {
		final Pattern textPattern = Pattern.compile("^(?=.*[0-9]).*$");

		return textPattern.matcher(passwordModel.getPassword()).matches();

	}

}
