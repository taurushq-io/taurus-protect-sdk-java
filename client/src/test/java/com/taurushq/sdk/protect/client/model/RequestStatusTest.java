package com.taurushq.sdk.protect.client.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RequestStatusTest {

    @Test
    void valueOfLabel() {
        assertEquals(RequestStatus.UNKNOWN, RequestStatus.valueOfLabel("test"));
        assertEquals(RequestStatus.UNKNOWN, RequestStatus.valueOfLabel(""));
        assertEquals(RequestStatus.UNKNOWN, RequestStatus.valueOfLabel(null));
        assertEquals(RequestStatus.CREATED, RequestStatus.valueOfLabel("created"));
        assertEquals(RequestStatus.CREATED, RequestStatus.valueOfLabel("CREATED"));
    }


}