package com.metehanbolat.sealedenumcompose

sealed class HttpError(val code: Int) {
    data class Unauthorized(val reason: String): HttpError(1)
    object NotFound: HttpError(2)

    fun doSomething() {

    }
}

enum class HttpErrorEnum(val code: Int) {
    Unauthorized(1),
    NotFound(2);

    fun doSomething() {

    }
}

sealed interface HttpErrorSealedInterface {
    data class Unauthorized(val reason: String): HttpErrorSealedInterface
    object NotFound: HttpErrorSealedInterface
}
