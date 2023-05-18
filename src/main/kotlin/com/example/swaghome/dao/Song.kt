package com.example.swaghome.dao

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
@Document("song")
class Song (
    @Id
    var id: String? = ObjectId().toHexString(),
    var name: String = "",
    var mp3: String = ""
)