package com.taurushq.sdk.protect.client.model;

/**
 * The type Api exception.
 */
public class ApiException extends Exception {

    private String error;
    private String message;
    private int code;
    private String errorCode;
    private Exception originalException;

    /**
     * Gets original exception.
     *
     * @return the original exception
     */
    public Exception getOriginalException() {
        return originalException;
    }

    /**
     * Sets original exception.
     *
     * @param originalException the original exception
     */
    public void setOriginalException(Exception originalException) {
        this.originalException = originalException;
    }

    /**
     * Gets error.
     *
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error the error
     */
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets error code.
     *
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets error code.
     *
     * @param errorCode the error code
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
