/*
 * Copyright (c) 2022. by Vadim-Burns. Take it if you can and use however you want.
 */

package com.cup.of.java.backend.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@Getter
@ApiModel(value = "AuthorizationResponse")
public class AuthorizationResponse {
    private final String name;
    private final String role;
}
