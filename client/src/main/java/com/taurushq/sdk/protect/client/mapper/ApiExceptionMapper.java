package com.taurushq.sdk.protect.client.mapper;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.taurushq.sdk.protect.client.model.ApiException;


/**
 * The type Api exception mapper.
 */
public class ApiExceptionMapper {

    private final Gson gson;

    /**
     * Instantiates a new Api exception mapper.
     */
    public ApiExceptionMapper() {
        this.gson = new Gson();
    }


    /**
     * To api exception api exception.
     *
     * @param e the e
     * @return the api exception
     */
    @SuppressWarnings("PMD.EmptyCatchBlock")
    public ApiException toApiException(com.taurushq.sdk.protect.openapi.ApiException e) {

        ApiException apiException = new ApiException();

        apiException.setError("Unknown");
        apiException.setCode(e.getCode());
        apiException.setMessage(e.getMessage());


        if (!Strings.isNullOrEmpty(e.getResponseBody())) {
            try {
                apiException = gson.fromJson(e.getResponseBody(), ApiException.class);
            } catch (JsonSyntaxException ex) {
                // silent catch
            }
        }
        apiException.setOriginalException(e);

        return apiException;
    }
}
