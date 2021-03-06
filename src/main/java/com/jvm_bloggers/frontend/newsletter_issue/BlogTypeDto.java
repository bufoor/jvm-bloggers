package com.jvm_bloggers.frontend.newsletter_issue;

import com.google.common.collect.ImmutableMap;
import com.jvm_bloggers.core.data_fetching.blogs.domain.BlogType;

import java.util.Map;

public enum BlogTypeDto {

    PERSONAL, COMPANY, VIDEOS;

    private static Map<BlogType, BlogTypeDto> mappings =
        ImmutableMap.<BlogType, BlogTypeDto>builder()
            .put(BlogType.PERSONAL, PERSONAL)
            .put(BlogType.COMPANY, COMPANY)
            .put(BlogType.VIDEOS, VIDEOS)
            .build();

    static BlogTypeDto fromBlogType(BlogType blogType) {
        return mappings.get(blogType);
    }

}
