package com.example.sgpslegadowebapi.domain.shared.exception;


import com.example.sgpslegadowebapi.domain.shared.message.MessageCode;
import lombok.Getter;

@Getter
public class DomainException extends RuntimeException {


    private final String code;

    public DomainException(String message) {
        this((String) null, message);
    }

    public DomainException(String code, String message) {
        super(message);
        this.code = code;
    }

    public DomainException(MessageCode code, String message) {
        this(code.getCode(), message);
    }

}
