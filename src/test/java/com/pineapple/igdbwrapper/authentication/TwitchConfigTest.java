package com.pineapple.igdbwrapper.authentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwitchConfigTest {
    TwitchConfig twitchConfig;

    @Test
    public void shouldReadCredentials(){
        twitchConfig = new TwitchConfig("testId", "testSecret");

        Assertions.assertEquals("testId", twitchConfig.clientId());
        Assertions.assertEquals("testSecret", twitchConfig.clientSecret());
    }
}
