package com.uade.ad.controller;

import com.uade.ad.service.ConversionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/conversions")
public class ConversionsController {
    private final ConversionService conversionService;

    public ConversionsController(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
}
