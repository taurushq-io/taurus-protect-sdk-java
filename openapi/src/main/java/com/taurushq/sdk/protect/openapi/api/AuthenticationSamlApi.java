/*
 * Taurus-PROTECT APIs
 * Taurus-PROTECT APIs description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.taurushq.sdk.protect.openapi.api;

import com.taurushq.sdk.protect.openapi.ApiCallback;
import com.taurushq.sdk.protect.openapi.ApiClient;
import com.taurushq.sdk.protect.openapi.ApiException;
import com.taurushq.sdk.protect.openapi.ApiResponse;
import com.taurushq.sdk.protect.openapi.Configuration;
import com.taurushq.sdk.protect.openapi.Pair;
import com.taurushq.sdk.protect.openapi.ProgressRequestBody;
import com.taurushq.sdk.protect.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.taurushq.sdk.protect.openapi.model.GooglerpcStatus;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordSAMLCheckAssertionReply;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordSAMLCheckAssertionRequest;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordSAMLInitiateReply;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordSAMLInitiateRequest;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordSAMLSessionReply;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationSamlApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthenticationSamlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationSamlApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for authenticationServiceSAMLCheckAssertion
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticationServiceSAMLCheckAssertionCall(TgvalidatordSAMLCheckAssertionRequest body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/rest/v1/authentication/saml/acs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyTPV1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call authenticationServiceSAMLCheckAssertionValidateBeforeCall(TgvalidatordSAMLCheckAssertionRequest body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling authenticationServiceSAMLCheckAssertion(Async)");
        }

        return authenticationServiceSAMLCheckAssertionCall(body, _callback);

    }

    /**
     * Check assertion
     * This endpoint checks the SAML assertion
     * @param body  (required)
     * @return TgvalidatordSAMLCheckAssertionReply
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public TgvalidatordSAMLCheckAssertionReply authenticationServiceSAMLCheckAssertion(TgvalidatordSAMLCheckAssertionRequest body) throws ApiException {
        ApiResponse<TgvalidatordSAMLCheckAssertionReply> localVarResp = authenticationServiceSAMLCheckAssertionWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Check assertion
     * This endpoint checks the SAML assertion
     * @param body  (required)
     * @return ApiResponse&lt;TgvalidatordSAMLCheckAssertionReply&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TgvalidatordSAMLCheckAssertionReply> authenticationServiceSAMLCheckAssertionWithHttpInfo(TgvalidatordSAMLCheckAssertionRequest body) throws ApiException {
        okhttp3.Call localVarCall = authenticationServiceSAMLCheckAssertionValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<TgvalidatordSAMLCheckAssertionReply>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Check assertion (asynchronously)
     * This endpoint checks the SAML assertion
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticationServiceSAMLCheckAssertionAsync(TgvalidatordSAMLCheckAssertionRequest body, final ApiCallback<TgvalidatordSAMLCheckAssertionReply> _callback) throws ApiException {

        okhttp3.Call localVarCall = authenticationServiceSAMLCheckAssertionValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<TgvalidatordSAMLCheckAssertionReply>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for authenticationServiceSAMLInitiate
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticationServiceSAMLInitiateCall(TgvalidatordSAMLInitiateRequest body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/rest/v1/authentication/saml/sso";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyTPV1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call authenticationServiceSAMLInitiateValidateBeforeCall(TgvalidatordSAMLInitiateRequest body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling authenticationServiceSAMLInitiate(Async)");
        }

        return authenticationServiceSAMLInitiateCall(body, _callback);

    }

    /**
     * Initiate login
     * This endpoint initiates a SAML login
     * @param body  (required)
     * @return TgvalidatordSAMLInitiateReply
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public TgvalidatordSAMLInitiateReply authenticationServiceSAMLInitiate(TgvalidatordSAMLInitiateRequest body) throws ApiException {
        ApiResponse<TgvalidatordSAMLInitiateReply> localVarResp = authenticationServiceSAMLInitiateWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Initiate login
     * This endpoint initiates a SAML login
     * @param body  (required)
     * @return ApiResponse&lt;TgvalidatordSAMLInitiateReply&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TgvalidatordSAMLInitiateReply> authenticationServiceSAMLInitiateWithHttpInfo(TgvalidatordSAMLInitiateRequest body) throws ApiException {
        okhttp3.Call localVarCall = authenticationServiceSAMLInitiateValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<TgvalidatordSAMLInitiateReply>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Initiate login (asynchronously)
     * This endpoint initiates a SAML login
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticationServiceSAMLInitiateAsync(TgvalidatordSAMLInitiateRequest body, final ApiCallback<TgvalidatordSAMLInitiateReply> _callback) throws ApiException {

        okhttp3.Call localVarCall = authenticationServiceSAMLInitiateValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<TgvalidatordSAMLInitiateReply>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for authenticationServiceSAMLSession
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticationServiceSAMLSessionCall(Object body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/rest/v1/authentication/saml/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyTPV1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call authenticationServiceSAMLSessionValidateBeforeCall(Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling authenticationServiceSAMLSession(Async)");
        }

        return authenticationServiceSAMLSessionCall(body, _callback);

    }

    /**
     * Get authentication token
     * This endpoint returns an authentication token following a SAML login
     * @param body  (required)
     * @return TgvalidatordSAMLSessionReply
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public TgvalidatordSAMLSessionReply authenticationServiceSAMLSession(Object body) throws ApiException {
        ApiResponse<TgvalidatordSAMLSessionReply> localVarResp = authenticationServiceSAMLSessionWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Get authentication token
     * This endpoint returns an authentication token following a SAML login
     * @param body  (required)
     * @return ApiResponse&lt;TgvalidatordSAMLSessionReply&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TgvalidatordSAMLSessionReply> authenticationServiceSAMLSessionWithHttpInfo(Object body) throws ApiException {
        okhttp3.Call localVarCall = authenticationServiceSAMLSessionValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<TgvalidatordSAMLSessionReply>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get authentication token (asynchronously)
     * This endpoint returns an authentication token following a SAML login
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request: indicates that the server cannot or will not process the request due to something that is perceived to be a client error (for example, malformed request syntax, invalid request message framing, or deceptive request routing) </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized: indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden: indicates that the server understands the request but refuses to authorize it </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found: indicates that the server cannot find the requested resource </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error: indicates that the server encountered an unexpected condition that prevented it from fulfilling the request </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable: indicates that the server is not ready to handle the request. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call authenticationServiceSAMLSessionAsync(Object body, final ApiCallback<TgvalidatordSAMLSessionReply> _callback) throws ApiException {

        okhttp3.Call localVarCall = authenticationServiceSAMLSessionValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<TgvalidatordSAMLSessionReply>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
