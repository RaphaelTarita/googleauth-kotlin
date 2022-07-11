package com.rtarita.googleauthkotlin

import com.warrenstrange.googleauth.GoogleAuthenticator
import com.warrenstrange.googleauth.GoogleAuthenticatorConfig

public inline fun googleAuthenticator(builderAction: KGoogleAuthenticatorConfigBuilder.() -> Unit): GoogleAuthenticator {
    val configBuilder = KGoogleAuthenticatorConfigBuilder(GoogleAuthenticatorConfig.GoogleAuthenticatorConfigBuilder())
    configBuilder.builderAction()
    return GoogleAuthenticator(configBuilder.build())
}