package com.example.easyadminserviceframework.common.exception;

import com.example.easyadminserviceframework.common.enums.ResultCode;

public class BizException extends BaseException {
    public BizException(ResultCode resultCode) {
        super(resultCode);
    }
}