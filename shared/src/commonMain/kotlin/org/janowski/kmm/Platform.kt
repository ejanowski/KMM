package org.janowski.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform