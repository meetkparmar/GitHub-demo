package com.example.githubdemo.models

data class PrDetails(
    var title: String? = "",
    var created_at: String? = "",
    var closed_at: String? = "",
    var user: User
)