package com.pineapple.igdbwrapper.authentication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public record TwitchConfig(@Value("${twitch.client-id}") String clientId,
                           @Value("${twitch.client-secret}") String clientSecret) {
}
