package com.example.swaghome.dao

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id

class Playlist (
    var id: String? = ObjectId().toHexString(),
    var name: String = "",
    var songs: List<Song> = emptyList()
)