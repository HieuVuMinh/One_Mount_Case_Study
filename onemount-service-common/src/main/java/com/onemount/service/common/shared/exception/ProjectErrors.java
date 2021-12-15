package com.onemount.service.common.shared.exception;

import org.springframework.http.HttpStatus;

public class ProjectErrors {

    private ProjectErrors() {}

    /**
     * 400
     */
    public static final ProjectModelError INVALID_PARAMETERS = new ProjectModelError(400004, "Invalid parameters", HttpStatus.BAD_REQUEST);

    /**
     * 401
     */
    public static final ProjectModelError USER_NOT_UNAUTHORIZED = new ProjectModelError(401, "User is unauthorized", HttpStatus.UNAUTHORIZED);

    /**
     * 403
     */
    public static final ProjectModelError FORBIDDEN_ERROR = new ProjectModelError(403003, "You don not have any permissions to access this resource", HttpStatus.FORBIDDEN);

    /**
     * 404
     */
    public static final ProjectModelError ACCOUNT_NOT_FOUND = new ProjectModelError(404, "account not found", HttpStatus.NOT_FOUND);
    public static final ProjectModelError PROJECT_NOT_FOUND = new ProjectModelError(404, "project not found", HttpStatus.NOT_FOUND);
    public static final ProjectModelError PROPERTY_NOT_FOUND = new ProjectModelError(404, "property not found", HttpStatus.NOT_FOUND);
    public static final ProjectModelError SECTOR_NOT_FOUND = new ProjectModelError(404, "sector not found", HttpStatus.NOT_FOUND);

    /**
     * 500
     */
    public static final ProjectModelError INTERNAL_SERVER_ERROR = new ProjectModelError(500002, "Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);

}
