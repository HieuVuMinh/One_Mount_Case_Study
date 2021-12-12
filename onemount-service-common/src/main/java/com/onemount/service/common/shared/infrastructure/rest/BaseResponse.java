package com.onemount.service.common.shared.infrastructure.rest;


//import com.onemount.common.shared.exception.HousingBusinessError;
//import com.onemount.common.shared.exception.HousingException;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

@Data
@Accessors(chain = true)
@Slf4j
public class BaseResponse<T> {
    public static final String OK_CODE = "200";
    private T data;
    private Metadata meta = new Metadata();

    public static <T> BaseResponse<T> ofSucceeded(T data) {
        BaseResponse<T> response = new BaseResponse<>();
        response.data = data;
        response.meta.code = OK_CODE;
        return response;
    }

    public static <T> BaseResponse<T> ofSucceeded() {
        BaseResponse<T> response = new BaseResponse<>();
        response.meta.code = OK_CODE;
        return response;
    }

    @Data
    public static class Metadata {
        private String code;
        private Integer page;
        private Integer size;
        private Long total;
        private String message;
        private String requestId;
    }
}
