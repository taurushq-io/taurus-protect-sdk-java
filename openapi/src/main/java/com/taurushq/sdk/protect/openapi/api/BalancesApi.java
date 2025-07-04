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
import com.taurushq.sdk.protect.openapi.model.TgvalidatordGetBalancesReply;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordGetNFTCollectionBalancesReply;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalancesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BalancesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BalancesApi(ApiClient apiClient) {
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
     * Build call for walletServiceGetBalances
     * @param currency Filter on ID or symbol of the currency (optional)
     * @param limit  (optional)
     * @param cursor  (optional)
     * @param tokenId  (optional)
     * @param requestCursorCurrentPage Base64-encoded string representing the current window of data (optional)
     * @param requestCursorPageRequest The page to request, w.r.t the current page. Can be one of &#x60;FIRST&#x60;, &#x60;PREVIOUS&#x60;, &#x60;NEXT&#x60;, &#x60;LAST&#x60; (optional)
     * @param requestCursorPageSize The size of the page requested. The handling service should impose a hard limit on this (optional)
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
    public okhttp3.Call walletServiceGetBalancesCall(String currency, String limit, byte[] cursor, String tokenId, String requestCursorCurrentPage, String requestCursorPageRequest, String requestCursorPageSize, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/v1/balances";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (currency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("currency", currency));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (tokenId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tokenId", tokenId));
        }

        if (requestCursorCurrentPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("requestCursor.currentPage", requestCursorCurrentPage));
        }

        if (requestCursorPageRequest != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("requestCursor.pageRequest", requestCursorPageRequest));
        }

        if (requestCursorPageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("requestCursor.pageSize", requestCursorPageSize));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyTPV1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call walletServiceGetBalancesValidateBeforeCall(String currency, String limit, byte[] cursor, String tokenId, String requestCursorCurrentPage, String requestCursorPageRequest, String requestCursorPageSize, final ApiCallback _callback) throws ApiException {
        return walletServiceGetBalancesCall(currency, limit, cursor, tokenId, requestCursorCurrentPage, requestCursorPageRequest, requestCursorPageSize, _callback);

    }

    /**
     * Get the total balances for the tenant, for each asset
     * Get the total balances for the tenant, for each asset An asset is identified by a full triplet of attributes blockchain, arg1, arg2 (typically blockchain, contract number, and token ID)
     * @param currency Filter on ID or symbol of the currency (optional)
     * @param limit  (optional)
     * @param cursor  (optional)
     * @param tokenId  (optional)
     * @param requestCursorCurrentPage Base64-encoded string representing the current window of data (optional)
     * @param requestCursorPageRequest The page to request, w.r.t the current page. Can be one of &#x60;FIRST&#x60;, &#x60;PREVIOUS&#x60;, &#x60;NEXT&#x60;, &#x60;LAST&#x60; (optional)
     * @param requestCursorPageSize The size of the page requested. The handling service should impose a hard limit on this (optional)
     * @return TgvalidatordGetBalancesReply
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
    public TgvalidatordGetBalancesReply walletServiceGetBalances(String currency, String limit, byte[] cursor, String tokenId, String requestCursorCurrentPage, String requestCursorPageRequest, String requestCursorPageSize) throws ApiException {
        ApiResponse<TgvalidatordGetBalancesReply> localVarResp = walletServiceGetBalancesWithHttpInfo(currency, limit, cursor, tokenId, requestCursorCurrentPage, requestCursorPageRequest, requestCursorPageSize);
        return localVarResp.getData();
    }

    /**
     * Get the total balances for the tenant, for each asset
     * Get the total balances for the tenant, for each asset An asset is identified by a full triplet of attributes blockchain, arg1, arg2 (typically blockchain, contract number, and token ID)
     * @param currency Filter on ID or symbol of the currency (optional)
     * @param limit  (optional)
     * @param cursor  (optional)
     * @param tokenId  (optional)
     * @param requestCursorCurrentPage Base64-encoded string representing the current window of data (optional)
     * @param requestCursorPageRequest The page to request, w.r.t the current page. Can be one of &#x60;FIRST&#x60;, &#x60;PREVIOUS&#x60;, &#x60;NEXT&#x60;, &#x60;LAST&#x60; (optional)
     * @param requestCursorPageSize The size of the page requested. The handling service should impose a hard limit on this (optional)
     * @return ApiResponse&lt;TgvalidatordGetBalancesReply&gt;
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
    public ApiResponse<TgvalidatordGetBalancesReply> walletServiceGetBalancesWithHttpInfo(String currency, String limit, byte[] cursor, String tokenId, String requestCursorCurrentPage, String requestCursorPageRequest, String requestCursorPageSize) throws ApiException {
        okhttp3.Call localVarCall = walletServiceGetBalancesValidateBeforeCall(currency, limit, cursor, tokenId, requestCursorCurrentPage, requestCursorPageRequest, requestCursorPageSize, null);
        Type localVarReturnType = new TypeToken<TgvalidatordGetBalancesReply>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the total balances for the tenant, for each asset (asynchronously)
     * Get the total balances for the tenant, for each asset An asset is identified by a full triplet of attributes blockchain, arg1, arg2 (typically blockchain, contract number, and token ID)
     * @param currency Filter on ID or symbol of the currency (optional)
     * @param limit  (optional)
     * @param cursor  (optional)
     * @param tokenId  (optional)
     * @param requestCursorCurrentPage Base64-encoded string representing the current window of data (optional)
     * @param requestCursorPageRequest The page to request, w.r.t the current page. Can be one of &#x60;FIRST&#x60;, &#x60;PREVIOUS&#x60;, &#x60;NEXT&#x60;, &#x60;LAST&#x60; (optional)
     * @param requestCursorPageSize The size of the page requested. The handling service should impose a hard limit on this (optional)
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
    public okhttp3.Call walletServiceGetBalancesAsync(String currency, String limit, byte[] cursor, String tokenId, String requestCursorCurrentPage, String requestCursorPageRequest, String requestCursorPageSize, final ApiCallback<TgvalidatordGetBalancesReply> _callback) throws ApiException {

        okhttp3.Call localVarCall = walletServiceGetBalancesValidateBeforeCall(currency, limit, cursor, tokenId, requestCursorCurrentPage, requestCursorPageRequest, requestCursorPageSize, _callback);
        Type localVarReturnType = new TypeToken<TgvalidatordGetBalancesReply>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for walletServiceGetNFTCollectionBalances
     * @param blockchain  (optional)
     * @param query Filter on the NFT name, the NFT symbol or the NFT contract address (optional)
     * @param cursorCurrentPage Base64-encoded string representing the current window of data (optional)
     * @param cursorPageRequest The page to request, w.r.t the current page. Can be one of &#x60;FIRST&#x60;, &#x60;PREVIOUS&#x60;, &#x60;NEXT&#x60;, &#x60;LAST&#x60; (optional)
     * @param cursorPageSize The size of the page requested. The handling service should impose a hard limit on this (optional)
     * @param network  (optional)
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
    public okhttp3.Call walletServiceGetNFTCollectionBalancesCall(String blockchain, String query, String cursorCurrentPage, String cursorPageRequest, String cursorPageSize, String network, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/rest/v1/balances/nft/collections";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (blockchain != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("blockchain", blockchain));
        }

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (cursorCurrentPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor.currentPage", cursorCurrentPage));
        }

        if (cursorPageRequest != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor.pageRequest", cursorPageRequest));
        }

        if (cursorPageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor.pageSize", cursorPageSize));
        }

        if (network != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("network", network));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyTPV1" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call walletServiceGetNFTCollectionBalancesValidateBeforeCall(String blockchain, String query, String cursorCurrentPage, String cursorPageRequest, String cursorPageSize, String network, final ApiCallback _callback) throws ApiException {
        return walletServiceGetNFTCollectionBalancesCall(blockchain, query, cursorCurrentPage, cursorPageRequest, cursorPageSize, network, _callback);

    }

    /**
     * Get the total balances for the tenant, for each nft collection
     * Get the total balances for the tenant, for each nft collection
     * @param blockchain  (optional)
     * @param query Filter on the NFT name, the NFT symbol or the NFT contract address (optional)
     * @param cursorCurrentPage Base64-encoded string representing the current window of data (optional)
     * @param cursorPageRequest The page to request, w.r.t the current page. Can be one of &#x60;FIRST&#x60;, &#x60;PREVIOUS&#x60;, &#x60;NEXT&#x60;, &#x60;LAST&#x60; (optional)
     * @param cursorPageSize The size of the page requested. The handling service should impose a hard limit on this (optional)
     * @param network  (optional)
     * @return TgvalidatordGetNFTCollectionBalancesReply
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
    public TgvalidatordGetNFTCollectionBalancesReply walletServiceGetNFTCollectionBalances(String blockchain, String query, String cursorCurrentPage, String cursorPageRequest, String cursorPageSize, String network) throws ApiException {
        ApiResponse<TgvalidatordGetNFTCollectionBalancesReply> localVarResp = walletServiceGetNFTCollectionBalancesWithHttpInfo(blockchain, query, cursorCurrentPage, cursorPageRequest, cursorPageSize, network);
        return localVarResp.getData();
    }

    /**
     * Get the total balances for the tenant, for each nft collection
     * Get the total balances for the tenant, for each nft collection
     * @param blockchain  (optional)
     * @param query Filter on the NFT name, the NFT symbol or the NFT contract address (optional)
     * @param cursorCurrentPage Base64-encoded string representing the current window of data (optional)
     * @param cursorPageRequest The page to request, w.r.t the current page. Can be one of &#x60;FIRST&#x60;, &#x60;PREVIOUS&#x60;, &#x60;NEXT&#x60;, &#x60;LAST&#x60; (optional)
     * @param cursorPageSize The size of the page requested. The handling service should impose a hard limit on this (optional)
     * @param network  (optional)
     * @return ApiResponse&lt;TgvalidatordGetNFTCollectionBalancesReply&gt;
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
    public ApiResponse<TgvalidatordGetNFTCollectionBalancesReply> walletServiceGetNFTCollectionBalancesWithHttpInfo(String blockchain, String query, String cursorCurrentPage, String cursorPageRequest, String cursorPageSize, String network) throws ApiException {
        okhttp3.Call localVarCall = walletServiceGetNFTCollectionBalancesValidateBeforeCall(blockchain, query, cursorCurrentPage, cursorPageRequest, cursorPageSize, network, null);
        Type localVarReturnType = new TypeToken<TgvalidatordGetNFTCollectionBalancesReply>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the total balances for the tenant, for each nft collection (asynchronously)
     * Get the total balances for the tenant, for each nft collection
     * @param blockchain  (optional)
     * @param query Filter on the NFT name, the NFT symbol or the NFT contract address (optional)
     * @param cursorCurrentPage Base64-encoded string representing the current window of data (optional)
     * @param cursorPageRequest The page to request, w.r.t the current page. Can be one of &#x60;FIRST&#x60;, &#x60;PREVIOUS&#x60;, &#x60;NEXT&#x60;, &#x60;LAST&#x60; (optional)
     * @param cursorPageSize The size of the page requested. The handling service should impose a hard limit on this (optional)
     * @param network  (optional)
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
    public okhttp3.Call walletServiceGetNFTCollectionBalancesAsync(String blockchain, String query, String cursorCurrentPage, String cursorPageRequest, String cursorPageSize, String network, final ApiCallback<TgvalidatordGetNFTCollectionBalancesReply> _callback) throws ApiException {

        okhttp3.Call localVarCall = walletServiceGetNFTCollectionBalancesValidateBeforeCall(blockchain, query, cursorCurrentPage, cursorPageRequest, cursorPageSize, network, _callback);
        Type localVarReturnType = new TypeToken<TgvalidatordGetNFTCollectionBalancesReply>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
