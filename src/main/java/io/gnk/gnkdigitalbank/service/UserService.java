package io.gnk.gnkdigitalbank.service;

import io.gnk.gnkdigitalbank.dto.*;

public interface UserService {
    BankResponse crateAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transfer(TransfertRequest request);
}
