package classwork.enums;

import lombok.Getter;

import java.util.Objects;

@Getter
public enum HttpCode {
    REDIRECTION(200,  299), CLIENT_ERROR(300, 399), SERVER_ERROR(400, 499);

    private final int minCode;
    private final int maxCode;

    HttpCode(int minCode, int maxCode) {
        this.minCode = minCode;
        this.maxCode = maxCode;
    }

    public static HttpCode findByCode (int newCode) {
        HttpCode[] httpCodes = values();
        for(HttpCode httpCode : httpCodes){
            if (newCode >= httpCode.minCode && newCode <= httpCode.maxCode){
                return httpCode;
            }
        }
        throw new IllegalArgumentException("Code " + newCode + " was not found");
    }
}