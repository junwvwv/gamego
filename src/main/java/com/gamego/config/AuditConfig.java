package com.gamego.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing //Jpa 의 Auditing 기능을 활성화
public class AuditConfig {

    @Bean
    public AuditorAware<String> auditorProvider(){
        return new AuditorAwareImpl(); //등록 및 수정자 처리를 해주는 AuditorAwareImpl 을 빈으로 등록한다
    }

}
