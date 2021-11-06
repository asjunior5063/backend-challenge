package br.itidigital.backendchallenge.domain.validations;

import br.itidigital.backendchallenge.domain.model.PasswordModel;

public class HasNoRepetingSpecialCharacters implements IValidations {

	@Override
	public boolean isValid(final PasswordModel passwordModel) {
		String[] splitted = passwordModel.getPassword().split("");
		for(int i = 0 ; i< splitted.length; i++) {
			if(i+1 == splitted.length)
				break;

			for(int o = 0 ; o< splitted.length; o++) {
				if(i==o)
					continue;

				if(splitted[i].equals(splitted[o]))
					return false;
			}
		}

		return true;
	}

}
