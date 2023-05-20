package com.example.InjectionService.config;

import com.example.InjectionService.model.PrototypeScope;
import com.example.InjectionService.model.WebRequestScope;
import com.example.InjectionService.model.SingletonScope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class AppConfig {

    @Bean
    @RequestScope
    public WebRequestScope _RequestScopeService() {
        return new WebRequestScope();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeScope _PrototypeScopeService() {
        return new PrototypeScope();
    }

    @Bean
    @Scope("singleton")
    public SingletonScope _SingletonScopeService() {
        return new SingletonScope();
    }

}