package com.green.greengram.application.feedcomment.model;

import jakarta.validation.constraints.*;

import java.beans.ConstructorProperties;

public class FeedCommentGetReq {
    @Positive
    @NotNull(message = "feed_id는 필수값")
    private Long feedId;

    @PositiveOrZero
    @NotNull(message = "start_idx는 필수값")
    private Integer startIdx;

    //@Min(20) @Max(50)
    @NotNull(message = "size는 필수값")
    private Integer size;

    @ConstructorProperties({"feed_id", "start_idx", "size"})

}
