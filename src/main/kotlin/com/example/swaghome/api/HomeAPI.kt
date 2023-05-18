package com.example.swaghome.api

import com.example.swaghome.bl.HomeBL
import com.example.swaghome.dao.Artist
import com.example.swaghome.dao.Playlist
import com.example.swaghome.service.SwagArtistService
import com.example.swaghome.service.SwagProfileService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeAPI @Autowired constructor(private val swagArtistService: SwagArtistService, private val swagProfileService: SwagProfileService) {
    // Business Logic
    private var homeBL: HomeBL? = null
    @Autowired
    fun HomeAPI(homeBL: HomeBL?) {
        this.homeBL = homeBL
    }

    // Logger
    companion object {
        private val LOGGER: Logger = LoggerFactory.getLogger(HomeAPI::class.java)
    }

    // Artist API (Get All Artists)
    @GetMapping("/artist")
    fun getAllArtists(): List<Artist> {
        // Logger
        LOGGER.info("External Swag Artist API working")
        // Response
        return swagArtistService.getAllArtists()
    }

    // Profile API (Get Playlist by User ID)
    @GetMapping("/profile/playlist/{id}")
    fun getPlaylistByUserId(
            @PathVariable("id") id: String
    ): List<Playlist> {
        // Logger
        LOGGER.info("External Swag Profile API working")
        // Response
        return swagProfileService.playlistByUserId(id)
    }

    // Profile API (Get Favorite Artists by User ID)
    @GetMapping("/profile/favArtist/{id}")
    fun getFavArtistByUserId(
            @PathVariable("id") id: String
    ): List<Artist> {
        // Logger
        LOGGER.info("External Swag Profile API working")
        // Response
        return swagProfileService.favArtistByUserId(id)
    }
}