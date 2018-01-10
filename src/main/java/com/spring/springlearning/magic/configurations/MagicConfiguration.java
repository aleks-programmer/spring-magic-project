package com.spring.springlearning.magic.configurations;

import com.spring.springlearning.magic.beans.Magic;
import com.spring.springlearning.magic.beans.MagicDevBean;
import com.spring.springlearning.magic.beans.MagicProdBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MagicConfiguration {

    @Bean
    @Profile(value = "dev")
    public Magic getMagicDevBean() {
        return new MagicDevBean();
    }

    @Bean
    @Profile(value = "prod")
    public Magic getMagicProdBean() {
        return new MagicProdBean();
    }

}
