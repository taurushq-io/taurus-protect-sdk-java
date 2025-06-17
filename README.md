# Taurus-PROTECT Java SDK

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This repository provides example Java code to consume a subset of APIs of Taurus-PROTECT.

## Organization

This repository contains two Java modules: `openapi` and  `client`.

The `openapi` [module](openapi) is generated from OpenAPI descriptions and should not be modified.

The `client` [module](client) contains a higher level Java code that should be used to interact with the Taurus-PROTECT
APIs. This module is based on the `openapi` module.

## Build

In order to build the library using OpenJDK 8 (tested with Correto 8), run the following command:

```
mvn clean compile
```

To install it using OpenJDK 8 (tested with Correto 8) locally:

```
mvn clean install
```

## Usage

To start interacting with the Taurus-PROTECT APIs, a client needs first to be created:

```java
private final String host = "http://localhost:6000";
private final String apiKey = "my-api-key";
private final String apiSecret = "my-api-secret";

ProtectClient client = new ProtectClient(host, apiKey, apiSecret);
```

Several examples are
provided [here](client/src/test/java/com/taurushq/sdk/protect/client/ProtectClientIntegrationTest.java).

For example, to create an address:

```java
ProtectClient client = new ProtectClient(host, apiKey, apiSecret);

Address a = null;
try {
    a = client.getAddressService().createAddress(1, "my address", "my comment", "");
} catch (ApiException e) {

    System.out.println(e.getMessage());
    System.out.println(e.getError());

    throw new RuntimeException(e);
}
```

## Intellectual property

This code is copyright (c) 2025 Taurus SA. It is released under [MIT license](./LICENSE).
