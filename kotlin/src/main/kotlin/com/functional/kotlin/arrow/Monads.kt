package com.functional.kotlin.arrow

import arrow.core.Either

fun divide(num1: Int, num2: Int): Either<Throwable, Int> {
    return try {
        val res = num1 / num2;
        Either.Right(res);
    } catch (e: Exception) {
        Either.Left(e)
    }
}