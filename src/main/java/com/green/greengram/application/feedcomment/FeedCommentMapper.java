package com.green.greengram.application.feedcomment;

public interface FeedCommentMapper {
    List<FeedCommentItem> findAllByFeedIdLimitedTo(FeedCommentGetReq req);
}
