package com.example.sgpslegadowebapi.infra.message;

import com.example.sgpslegadowebapi.domain.shared.message.MessageCode;
import com.example.sgpslegadowebapi.domain.shared.message.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageSource messageSource;

    @Override
    public String getMessage(MessageCode messageCode, Locale locale, Object... args) {
        return messageSource.getMessage(messageCode.getCode(), args, locale);
    }

    @Override
    public String getMessage(MessageCode messageCode, Object... args) {
        return messageSource.getMessage(messageCode.getCode(), args, LocaleContextHolder.getLocale());
    }
}
