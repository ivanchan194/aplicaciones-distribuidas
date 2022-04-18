package com.uade.ad.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Multimedia {
    @Id
    private int idContent;

    @Enumerated(EnumType.STRING)
    private ContentType contentType;

    private String fileExtension;

    private String contentUrl;
}
