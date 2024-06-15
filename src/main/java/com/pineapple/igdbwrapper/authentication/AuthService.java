package com.pineapple.igdbwrapper.authentication;

import com.api.igdb.request.TwitchAuthenticator;
import com.api.igdb.utils.TwitchToken;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final TwitchConfig twitchConfig;

    public TwitchToken getTwitchToken(TwitchAuthenticator twitchAuthenticator){
        return twitchAuthenticator.requestTwitchToken(twitchConfig.clientId(), twitchConfig.clientSecret());
    }
}
