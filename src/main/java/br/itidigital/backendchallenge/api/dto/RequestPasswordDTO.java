package br.itidigital.backendchallenge.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestPasswordDTO {

    private String password;
    private Boolean isValid;
}
