package com.example.swaghome.dto

import com.example.swaghome.dao.Artist
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ArtistDTO: MongoRepository<Artist, String> {
    fun findOneById(id: String): Artist?
}