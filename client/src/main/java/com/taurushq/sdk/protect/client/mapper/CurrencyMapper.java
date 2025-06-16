package com.taurushq.sdk.protect.client.mapper;

import com.taurushq.sdk.protect.client.model.Currency;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCurrency;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * The interface Currency mapper.
 */
@Mapper
public interface CurrencyMapper {
    /**
     * The constant INSTANCE.
     */
    CurrencyMapper INSTANCE = Mappers.getMapper(CurrencyMapper.class);

    /**
     * From dto currency.
     *
     * @param currency the currency
     * @return the currency
     */
    @Mapping(source = "tokenID", target = "tokenId")
    Currency fromDTO(TgvalidatordCurrency currency);

}


