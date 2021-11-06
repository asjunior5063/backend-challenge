package br.itidigital.backendchallenge.api.dto;

import br.itidigital.backendchallenge.domain.model.PasswordModel;

import java.util.Objects;

public class PasswordConverter extends ConverterDTO<RequestPasswordDTO, PasswordModel> {
    @Override
    protected RequestPasswordDTO converterDTO(final PasswordModel passwordModel, Boolean isValid) {

        final RequestPasswordDTO dto = new RequestPasswordDTO();

        if  (!Objects.isNull(passwordModel.getPassword())) {
            dto.setPassword(passwordModel.getPassword());
        }

        dto.setIsValid(isValid);

        return dto;
    }
}
