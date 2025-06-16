package com.taurushq.sdk.protect.client.mapper;

import com.taurushq.sdk.protect.client.model.Wallet;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordWallet;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordWalletInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * The interface Wallet mapper.
 */
@Mapper(uses = {BalanceMapper.class, AttributeMapper.class, CurrencyMapper.class})
public interface WalletMapper {
    /**
     * The constant INSTANCE.
     */
    WalletMapper INSTANCE = Mappers.getMapper(WalletMapper.class);

    /**
     * From dto wallet.
     *
     * @param walletInfo the wallet info
     * @return the wallet
     */
//@Mapping(source = "numberOfSeats", target = "seatCount")
    Wallet fromDTO(TgvalidatordWalletInfo walletInfo);

    /**
     * From dto wallet.
     *
     * @param wallet the wallet
     * @return the wallet
     */
    @Mapping(target = "network", ignore = true)
    @Mapping(target = "visibilityGroupID", ignore = true)
    Wallet fromDTO(TgvalidatordWallet wallet);

}


