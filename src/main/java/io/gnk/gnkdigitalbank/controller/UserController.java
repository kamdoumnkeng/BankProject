package io.gnk.gnkdigitalbank.controller;

import io.gnk.gnkdigitalbank.dto.*;
import io.gnk.gnkdigitalbank.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User Account Management API")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @Operation(
            summary = "Create New User Account",
            description = "Creating a new user and assigning an account ID"
    )
    @ApiResponse(
            responseCode = "201",
            description = "Http Status 201 CREATED"

    )
    @PostMapping("/create")
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.crateAccount(userRequest);
    }

    @PostMapping("/login")
    public BankResponse login(@RequestBody LoginDTO loginDTO){
        return userService.login(loginDTO);
    }

    @Operation(
            summary = "Balance Enquiry",
            description = "Guiven an account number, check how much the user has"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"

    )
    @GetMapping("balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }
    @Operation(
            summary = "Name Enquiry",
            description = "Name the owner of the account"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http Status 200 SUCCESS"

    )
    @GetMapping("nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }

    @PostMapping("credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creditAccount(request);
    }

    @PostMapping("debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }

    @PostMapping("transfert")
    public BankResponse transfert(@RequestBody TransfertRequest request){
        return userService.transfer(request);
    }
}
