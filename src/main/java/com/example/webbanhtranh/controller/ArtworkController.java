package com.example.webbanhtranh.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.webbanhtranh.models.Artwork;
import com.example.webbanhtranh.service.ArtworkService;

import java.util.List;


@Controller
@RequestMapping("/artworks")
@Tag(name = "Artwork API", description = "Quản lý các thú cưng") // Gắn tag cho toàn bộ controller
public class ArtworkController {

    @Autowired
    private ArtworkService artworkService;

    @GetMapping
    @Operation(summary = "Danh sách tất cả artworks", description = "Trả về danh sách tất cả các thú cưng")
    public String listArtworks(Model model) {
        List<Artwork> artworks = artworkService.getAllArtworks();
        model.addAttribute("artworks", artworks);
        return "artworks";
    }

    @PostMapping
    @Operation(summary = "lưu artwork mới", description = " Lưu thông tin một thú cưng")
    public String saveArtwork(@ModelAttribute Artwork artwork) {
        artworkService.saveArtwork(artwork);
        return "redirect:/artworks";
    }

}
git init
