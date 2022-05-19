package com.uade.ad.service;

import com.uade.ad.repository.TypeRepository;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl implements TypeService{
    final
    TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }
}
