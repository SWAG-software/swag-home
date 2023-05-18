package com.example.swaghome.service

import com.example.swaghome.dao.Artist
import com.example.swaghome.dao.Playlist
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name="swag-profile")
interface SwagProfileService {
    // Get Playlist by User ID
    @GetMapping("/profile/playlist/{id}")
    fun playlistByUserId(
            @PathVariable("id") id: String
    ): List<Playlist>

    // Get Favorite Artists by User ID
    @GetMapping("/profile/favArtist/{id}")
    fun favArtistByUserId(
            @PathVariable("id") id: String
    ): List<Artist>
}