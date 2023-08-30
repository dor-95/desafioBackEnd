package com.picpaysimplificado.dtos;

import com.picpaysimplificado.domain.user.UserType;

import java.math.BigDecimal;

public record userDTO(String firstName, String lastName, String document, String email, String password, BigDecimal balance, UserType userType) {
}
