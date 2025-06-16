package com.taurushq.sdk.protect.client.mapper;

import com.taurushq.sdk.protect.client.model.Transaction;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordTransaction;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(uses = {AddressMapperImpl.class, CurrencyMapper.class})
public interface TransactionMapper {
    /**
     * The constant INSTANCE.
     */
    TransactionMapper INSTANCE = Mappers.getMapper(TransactionMapper.class);


    Transaction fromDTO(TgvalidatordTransaction transaction);

    List<Transaction> fromDTO(List<TgvalidatordTransaction> transactions);


}


