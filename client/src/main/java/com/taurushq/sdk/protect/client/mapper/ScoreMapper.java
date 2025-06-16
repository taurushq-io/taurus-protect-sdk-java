package com.taurushq.sdk.protect.client.mapper;

import com.taurushq.sdk.protect.client.model.Score;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordScore;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordTransactionScore;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * The interface Score mapper.
 */
@Mapper
public interface ScoreMapper {
    /**
     * The constant INSTANCE.
     */
    ScoreMapper INSTANCE = Mappers.getMapper(ScoreMapper.class);

    /**
     * From dto score.
     *
     * @param score the score
     * @return the score
     */
    Score fromDTO(TgvalidatordScore score);


    Score fromDTO(TgvalidatordTransactionScore score);
}


