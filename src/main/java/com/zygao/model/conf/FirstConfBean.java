package com.zygao.model.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by gaoziye on 2017/5/9.
 */
@ConfigurationProperties(prefix = "first.prop")
public class FirstConfBean {

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
