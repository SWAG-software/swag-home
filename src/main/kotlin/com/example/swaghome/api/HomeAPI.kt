package com.example.swaghome.api

import com.example.swaghome.bl.HomeBL
import com.example.swaghome.dao.Artist
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeAPI {
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

    // Test API
    @GetMapping("/test/{id}")
    fun getArtistById(
        @PathVariable("id") id: String
    ): ResponseEntity<Artist> {
        // Logger
        LOGGER.info("Custom Home API working")
        // BL
        val bl = homeBL?.findByArtistId(id)
        // Custom or Default values
        return if (bl != null) {
            ResponseEntity.ok(bl)
        } else {
            ResponseEntity.notFound().build()
        }
    }
}