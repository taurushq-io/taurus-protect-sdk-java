package com.taurushq.sdk.protect.client.model;

/**
 * The type Request metadata exception.
 */
public class RequestMetadataException extends Exception {
    /**
     * Instantiates a new Request metadata exception.
     *
     * @param message the message
     */
    public RequestMetadataException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Request metadata exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public RequestMetadataException(String message, Throwable cause) {
        super(message, cause);
    }
}
