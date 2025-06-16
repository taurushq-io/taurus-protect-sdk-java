package com.taurushq.sdk.protect.client.mapper;

import com.taurushq.sdk.protect.client.model.Address;
import com.taurushq.sdk.protect.client.model.AddressInfo;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordAddress;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordAddressInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * The interface Address mapper.
 */
@Mapper(uses = {WalletMapper.class, BalanceMapper.class, ScoreMapper.class, AttributeMapper.class, ScoreMapper.class, CurrencyMapper.class})
public interface AddressMapper {
    /**
     * The constant INSTANCE.
     */
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    /**
     * From dto address.
     *
     * @param address the address
     * @return the address
     */
    Address fromDTO(TgvalidatordAddress address);


    AddressInfo fromDTO(TgvalidatordAddressInfo addressInfo);
}


