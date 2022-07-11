package com.rtarita.googleauthkotlin

import com.warrenstrange.googleauth.GoogleAuthenticatorConfig
import com.warrenstrange.googleauth.GoogleAuthenticatorConfig.GoogleAuthenticatorConfigBuilder
import com.warrenstrange.googleauth.HmacHashFunction
import com.warrenstrange.googleauth.KeyRepresentation

@JvmInline
public value class KGoogleAuthenticatorConfigBuilder(@PublishedApi internal val javaBuilder: GoogleAuthenticatorConfigBuilder) {
    public inline var codeDigits: Int
        inline get() = javaBuilder.build().codeDigits
        inline set(value) {
            javaBuilder.setCodeDigits(value)
        }

    public inline var numberOfScratchCodes: Int
        inline get() = javaBuilder.build().numberOfScratchCodes
        inline set(value) {
            javaBuilder.setNumberOfScratchCodes(value)
        }

    public inline var timeStepSizeInMillis: Long
        inline get() = javaBuilder.build().timeStepSizeInMillis
        inline set(value) {
            javaBuilder.setTimeStepSizeInMillis(value)
        }

    public inline var windowSize: Int
        inline get() = javaBuilder.build().windowSize
        inline set(value) {
            javaBuilder.setWindowSize(value)
        }

    public inline var secretBits: Int
        inline get() = javaBuilder.build().secretBits
        inline set(value) {
            javaBuilder.setSecretBits(value)
        }

    public inline var keyRepresentation: KeyRepresentation
        inline get() = javaBuilder.build().keyRepresentation
        inline set(value) {
            javaBuilder.setKeyRepresentation(value)
        }

    public inline var hmacHashFunction: HmacHashFunction
        inline get() = javaBuilder.build().hmacHashFunction
        inline set(value) {
            javaBuilder.setHmacHashFunction(value)
        }

    @Suppress("NOTHING_TO_INLINE")
    public inline fun base32() {
        javaBuilder.setKeyRepresentation(KeyRepresentation.BASE32)
    }

    @Suppress("NOTHING_TO_INLINE")
    public inline fun base64() {
        javaBuilder.setKeyRepresentation(KeyRepresentation.BASE64)
    }

    @Suppress("NOTHING_TO_INLINE")
    public inline fun hmacSHA1() {
        javaBuilder.setHmacHashFunction(HmacHashFunction.HmacSHA1)
    }

    @Suppress("NOTHING_TO_INLINE")
    public inline fun hmacSHA256() {
        javaBuilder.setHmacHashFunction(HmacHashFunction.HmacSHA256)
    }

    @Suppress("NOTHING_TO_INLINE")
    public inline fun hmacSHA512() {
        javaBuilder.setHmacHashFunction(HmacHashFunction.HmacSHA512)
    }

    public inline fun javaBuilder(action: GoogleAuthenticatorConfigBuilder.() -> Unit) {
        javaBuilder.action()
    }

    public fun build(): GoogleAuthenticatorConfig = javaBuilder.build()
}