package com.onemount.service.common.shared.exception;

import lombok.Getter;

@Getter
public class ProjectException extends RuntimeException {

    private ProjectModelError errorCode;

    public ProjectException(ProjectModelError errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ProjectException(ProjectModelError errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ProjectException(ProjectModelError error, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = error;
    }
}
