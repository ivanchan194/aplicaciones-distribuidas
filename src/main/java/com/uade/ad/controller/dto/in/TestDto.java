package com.uade.ad.controller.dto.in;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
public class TestDto {
    private String texto;
    
    private List<MultipartFile> multipart;
}
