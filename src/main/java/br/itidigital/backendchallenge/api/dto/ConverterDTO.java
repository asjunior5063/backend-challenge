package br.itidigital.backendchallenge.api.dto;

public abstract class ConverterDTO<DTO, MODEL> {

    public DTO toDTO(final MODEL model,  Boolean isValid) {
        final DTO handler = converterDTO(model, isValid);

        return handler;
    }

    protected abstract DTO converterDTO(final MODEL model, Boolean isValid);
}
