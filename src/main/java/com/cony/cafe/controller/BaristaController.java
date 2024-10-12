package com.cony.cafe.controller;

import com.cony.cafe.dto.request.BaristaRequestDto;
import com.cony.cafe.dto.response.BaristaResponseDto;
import com.cony.cafe.service.BaristaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/barista")
public class BaristaController {
    private final BaristaService baristaService;

    @PostMapping
    public Long save(@RequestBody BaristaRequestDto baristaRequestDto) {
        return baristaService.save(baristaRequestDto);
    }

    @GetMapping
    public List<BaristaResponseDto> getAllBaristas() {
        return baristaService.findAll();
    }
}
