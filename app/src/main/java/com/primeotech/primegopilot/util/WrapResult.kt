package com.primeotech.primeotechmobileapp.core.network.retrofit

import io.reactivex.SingleTransformer

 fun <D> wrapResult(): SingleTransformer<D, ResultState<D>> = SingleTransformer {
    it.map { d -> ResultState.Success(d) as ResultState<D> }
            .onErrorReturn { e -> ResultState.Error(e, null) }
}