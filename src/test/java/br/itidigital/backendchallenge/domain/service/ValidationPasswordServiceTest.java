package br.itidigital.backendchallenge.domain.service;

import br.itidigital.backendchallenge.domain.model.PasswordModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = {ValidationPasswordService.class})
class ValidationPasswordServiceTest {

    @Autowired
    private ValidationPasswordService service;

    @Test
    void testIsValid_Valids() {

        assertTrue(service.isValid(PasswordModel.builder().password("AbTp9!fok").build()));
        assertTrue(service.isValid(PasswordModel.builder().password("Junior@32").build()));

    }

    @Test
    void testIsValid_Invalids() {

        assertFalse(service.isValid(PasswordModel.builder().password(" A b T p 9 ! f o k").build()));
        assertFalse(service.isValid(PasswordModel.builder().password("").build()));
        assertFalse(service.isValid(PasswordModel.builder().password(" ").build()));
        assertFalse(service.isValid(PasswordModel.builder().password("aa").build()));
        assertFalse(service.isValid(PasswordModel.builder().password("ab").build()));
        assertFalse(service.isValid(PasswordModel.builder().password("AAAbbbCc").build()));
        assertFalse(service.isValid(PasswordModel.builder().password("AbTp9!foo").build()));
        assertFalse(service.isValid(PasswordModel.builder().password("AbTp9!foA").build()));
        assertFalse(service.isValid(PasswordModel.builder().password("AbTp9 fok").build()));
        assertFalse(service.isValid(PasswordModel.builder().password("*/(012%#").build()));
        assertFalse(service.isValid(PasswordModel.builder().password("12345678").build()));
    }
}