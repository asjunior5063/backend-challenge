package br.itidigital.backendchallenge.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PasswordModel {

   private String password;
}
