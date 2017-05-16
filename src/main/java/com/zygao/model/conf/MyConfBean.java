package com.zygao.model.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by gaoziye on 2017/5/9.
 */
@Configuration
@ConfigurationProperties(prefix = "my.prop")
@PropertySource("classpath:conf/my.properties")
public class MyConfBean {

    private String concat;

    public String getConcat() {
        return concat;
    }

    public void setConcat(String concat) {
        this.concat = concat;
    }
}
