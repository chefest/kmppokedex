package com.chefsito.pokedex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform