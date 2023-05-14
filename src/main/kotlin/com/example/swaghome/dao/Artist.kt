package com.example.swaghome.dao

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("artist")
data class Artist (
    @Id
    val id: ObjectId = ObjectId(),
    val name: String = "",
    val genre: String = "",
    val country: String = ""
)