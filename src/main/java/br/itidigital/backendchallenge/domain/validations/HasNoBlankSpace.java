package br.itidigital.backendchallenge.domain.validations;

import br.itidigital.backendchallenge.domain.model.PasswordModel;
import org.springframework.util.StringUtils;

public class HasNoBlankSpace implements IValidations {

	@Override
	public boolean isValid(final PasswordModel passwordModel) {
		return !StringUtils.containsWhitespace(passwordModel.getPassword());
	}
}
