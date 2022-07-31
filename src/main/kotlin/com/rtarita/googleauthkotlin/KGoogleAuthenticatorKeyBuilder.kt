package com.rtarita.googleauthkotlin

import com.warrenstrange.googleauth.GoogleAuthenticatorKey
import com.warrenstrange.googleauth.GoogleAuthenticatorKey.Builder
import com.warrenstrange.googleauth.GoogleAuthenticatorConfig

@JvmInline
public value class KGoogleAuthenticatorKeyBuilder(@PublishedApi internal val javaBuilder: Builder) {
    public inline var config: GoogleAuthenticatorConfig
        inline  get() = javaBuilder.build().config
        inline set(value) {
            javaBuilder.setConfig(value)
        }

    public inline var key: String
        inline get() = javaBuilder.build().key
        inline set(value) {
            javaBuilder.setKey(value)
        }

    public inline var verificationCode: Int
        inline get() = javaBuilder.build().verificationCode
        inline set(value) {
            javaBuilder.setVerificationCode(value)
        }

    public inline var scratchCodes: List<Int>
        inline get() = javaBuilder.build().scratchCodes
        inline set(value) {
            javaBuilder.setScratchCodes(value)
        }

    public inline fun javaBuilder(action: Builder.() -> Unit) {
        javaBuilder.action()
    }

    public fun build(): GoogleAuthenticatorKey = javaBuilder.build()
}