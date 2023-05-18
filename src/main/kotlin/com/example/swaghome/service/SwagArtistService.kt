package com.example.swaghome.service

import com.example.swaghome.dao.Artist
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name="swag-artist")
interface SwagArtistService {
    @GetMapping("/artist")
    fun getAllArtists(): List<Artist>
}