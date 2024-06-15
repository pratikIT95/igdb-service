package com.pineapple.igdbwrapper.authentication;

import com.api.igdb.request.TwitchAuthenticator;
import com.api.igdb.utils.TwitchToken;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class AuthServiceTest {
    private AuthService authService;

    @Test
    void shouldGetToken(){
        TwitchConfig fakeTwitchConfig = new TwitchConfig("id","secret");
        TwitchAuthenticator twitchAuthenticator = Mockito.mock(TwitchAuthenticator.class);
        TwitchToken mockTwitchToken = new TwitchToken("token",1000L, "bearer");
        when(twitchAuthenticator.requestTwitchToken(fakeTwitchConfig.clientId(), fakeTwitchConfig.clientSecret())).thenReturn(mockTwitchToken);
        authService = new AuthService(fakeTwitchConfig);
        Assertions.assertEquals(mockTwitchToken, authService.getTwitchToken(twitchAuthenticator));
    }
}
