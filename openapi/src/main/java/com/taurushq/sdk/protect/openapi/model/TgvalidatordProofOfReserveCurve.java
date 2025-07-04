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


package com.taurushq.sdk.protect.openapi.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets tgvalidatordProofOfReserveCurve
 */
@JsonAdapter(TgvalidatordProofOfReserveCurve.Adapter.class)
public enum TgvalidatordProofOfReserveCurve {
  
  SECP256K1("Secp256k1"),
  
  ED25519("Ed25519"),
  
  SECP256R1("Secp256r1");

  private String value;

  TgvalidatordProofOfReserveCurve(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TgvalidatordProofOfReserveCurve fromValue(String value) {
    for (TgvalidatordProofOfReserveCurve b : TgvalidatordProofOfReserveCurve.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TgvalidatordProofOfReserveCurve> {
    @Override
    public void write(final JsonWriter jsonWriter, final TgvalidatordProofOfReserveCurve enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TgvalidatordProofOfReserveCurve read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TgvalidatordProofOfReserveCurve.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    TgvalidatordProofOfReserveCurve.fromValue(value);
  }
}

