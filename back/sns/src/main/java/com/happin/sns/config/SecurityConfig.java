package com.happin.sns.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()    // HttpServletRequest 사용하는 요청들에 대한 접근 제한을 설정
                .antMatchers("/api/hello").permitAll()
                .anyRequest().authenticated();  // 나머지 요청은 모두 인증 받아야한다.
    }
}
