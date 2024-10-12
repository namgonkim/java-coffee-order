package com.cony.cafe.service;

import com.cony.cafe.dto.request.BaristaRequestDto;
import com.cony.cafe.dto.response.BaristaResponseDto;
import com.cony.cafe.repository.BaristaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BaristaService {
    private final BaristaRepository baristaRepository;

    @Transactional
    public Long save(BaristaRequestDto baristaRequestDto) {
        return baristaRepository.save(baristaRequestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<BaristaResponseDto> findAll() {
        return baristaRepository.findAllByOrderByIdDesc().stream()
                .map(BaristaResponseDto::new)
                .collect(Collectors.toList());
    }
}
