package com.onemount.service.common.shared.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ProjectModelError {
    private int code;
    private String message;
    private HttpStatus httpStatus;

    public ProjectModelError(String resource){
        this.code = 404;
        this.message = resource +" is not found";
        this.httpStatus = HttpStatus.NOT_FOUND;
    }
}
