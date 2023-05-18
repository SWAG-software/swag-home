package com.example.swaghome.bl

import com.example.swaghome.dao.Artist
import com.example.swaghome.dto.ArtistDTO
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HomeBL @Autowired constructor(private val artistDTO: ArtistDTO) {
    // Logger
    companion object {
        private val LOGGER: Logger = LoggerFactory.getLogger(HomeBL::class.java)
    }
    fun findByArtistId(id: String): Artist? {
        // Logger
        LOGGER.info("Custom Home BL working")
        // DTO
        return artistDTO.findOneById(id)
    }
}