package io.gnk.gnkdigitalbank.service;

import io.gnk.gnkdigitalbank.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
}
