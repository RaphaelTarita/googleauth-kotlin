package com.rtarita.googleauthkotlin

import com.warrenstrange.googleauth.GoogleAuthenticator
import com.warrenstrange.googleauth.GoogleAuthenticatorConfig
import com.warrenstrange.googleauth.GoogleAuthenticatorKey

public inline fun googleAuthenticator(builderAction: KGoogleAuthenticatorConfigBuilder.() -> Unit): GoogleAuthenticator {
    val configBuilder = KGoogleAuthenticatorConfigBuilder(GoogleAuthenticatorConfig.GoogleAuthenticatorConfigBuilder())
    configBuilder.builderAction()
    return GoogleAuthenticator(configBuilder.build())
}

public inline fun googleAuthenticatorKey(builderAction: KGoogleAuthenticatorKeyBuilder.() -> Unit, key: String): GoogleAuthenticatorKey{
    val keyBuilder = KGoogleAuthenticatorKeyBuilder(GoogleAuthenticatorKey.Builder(key))
    keyBuilder.builderAction()
    return keyBuilder.build()
}