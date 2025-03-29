package com.tsci.theming_with_flavors

sealed interface Flavor {

    val name: String

    data object Milk: Flavor {
        override val name: String = "milk"

    }

    data object Chocolate: Flavor {
        override val name: String = "chocolate"
    }
}