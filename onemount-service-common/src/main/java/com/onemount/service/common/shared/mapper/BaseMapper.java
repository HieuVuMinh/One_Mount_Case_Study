package com.onemount.service.common.shared.mapper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

@Component
@Slf4j
public class BaseMapper {
    public static final String FORMAT_PATTERN = "dd/MM/yyyy";

    public static final String DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm";

    public Instant fromLocalDate(LocalDate date) {
        if (date == null) {
            return null;
        }
        return date.atStartOfDay(ZoneId.systemDefault()).toInstant();
    }
}
