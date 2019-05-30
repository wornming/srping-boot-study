package com.wornming.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置获取工具
 * @author wornming
 * @version 1.0
 * @since 2019/5/30 22:15
 */
@Component
public class ApplicationProperties {
    @Value("${com.wornming.title}")
    private String title;
    @Value("${com.wornming.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
