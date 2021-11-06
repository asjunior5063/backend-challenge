package br.itidigital.backendchallenge.domain.validations;

import br.itidigital.backendchallenge.domain.model.PasswordModel;
import org.apache.commons.lang3.StringUtils;


public class HasSpecialCharactersValidator implements IValidations {

	@Override
	public boolean isValid(final PasswordModel passwordModel) {

		return StringUtils.containsAny(passwordModel.getPassword(), "*[.*@!#%&()^~{}+/-]");
	}

}
