package com.zedsols.digital_twin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform