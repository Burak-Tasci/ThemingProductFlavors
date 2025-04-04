package com.tsci.theming_with_flavors

interface NetworkService {

    fun request(): String

}

class NetworkServiceImpl: NetworkService {

    override fun request(): String {
        return """
            request sent to ${BuildConfig.BASE_URL} at ${System.currentTimeMillis()}
        """.trimIndent()
    }

}
