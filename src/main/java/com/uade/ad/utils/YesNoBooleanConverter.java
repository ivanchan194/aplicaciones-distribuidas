package com.uade.ad.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class YesNoBooleanConverter implements AttributeConverter<Boolean, String> {
    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        return attribute ? "Y" : "N";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return dbData.equals("Y");
    }
}