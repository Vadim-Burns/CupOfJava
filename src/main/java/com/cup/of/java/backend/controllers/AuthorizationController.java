/*
 * Copyright (c) 2022. by Vadim-Burns. Take it if you can and use however you want.
 */

package com.cup.of.java.backend.controllers;

import com.cup.of.java.backend.responses.AuthorizationResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AuthorizationController {

    @GetMapping("")
    @ApiOperation(value = "Say my name")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 403, message = "invalid token")
    })
    public AuthorizationResponse sayMyName() {
        return new AuthorizationResponse("foo", "admin");
    }
}
