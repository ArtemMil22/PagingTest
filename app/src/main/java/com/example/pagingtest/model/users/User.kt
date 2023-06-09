package com.example.pagingtest.model.users

/**
 * Class for representing user data in the app.
 */
data class User(
    val id: Long,
    val imageUrl: String,
    val name: String,
    val company: String
)