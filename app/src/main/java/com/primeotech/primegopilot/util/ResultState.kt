package com.primeotech.primeotechmobileapp.core.network.retrofit

sealed class ResultState<T> {

    /**
     * A state of [data] which shows that we know there is still an update to come.
     */
    data class Loading<T>(val data: T) : ResultState<T>()

    data class Completed<T>(val data: T) : ResultState<T>()

    /**
     * A state that shows the [data] is the last known update.
     */
    data class Success<T>(val data: T) : ResultState<T>()

    /**
     * A state to show a [throwable] is thrown beside the [lastData] which is cached.
     */
    data class Error<T>(val throwable: Throwable, val lastData: T?) : ResultState<T>()
}