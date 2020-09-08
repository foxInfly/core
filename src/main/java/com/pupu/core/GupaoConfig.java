package com.pupu.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : lipu
 * @since : 2020-09-08 18:28
 */
@Configuration
public class GupaoConfig {

    @Bean
    public GupaoCore GupaoCore(){
        return new GupaoCore();
    }

}
