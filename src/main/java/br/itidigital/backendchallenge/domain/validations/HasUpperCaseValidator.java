package br.itidigital.backendchallenge.domain.validations;


import br.itidigital.backendchallenge.domain.model.PasswordModel;
import org.springframework.util.StringUtils;

import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class HasUpperCaseValidator implements IValidations {

	@Override
	public boolean isValid(final PasswordModel passwordModel) {

		final String oneUpper = "^(?=.*[A-Z]).*$";

		return passwordModel.getPassword().matches(oneUpper);
	}

}
