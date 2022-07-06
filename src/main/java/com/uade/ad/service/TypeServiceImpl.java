package com.uade.ad.service;

import com.uade.ad.model.Type;
import com.uade.ad.repository.TypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService{
    final
    TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public List<Type> findAll() {
        return typeRepository.findAll();
    }
}
