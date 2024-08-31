package com.damian.sga.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Response implements Serializable {
    private int statusCode;
    private String message;
    private Object data;
}
