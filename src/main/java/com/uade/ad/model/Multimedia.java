package com.uade.ad.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
public class Multimedia {
    @Id
    @GeneratedValue
    private int idContent;

    @Enumerated(EnumType.STRING)
    private ContentType contentType;

    private String fileExtension;

    private String contentUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    private Step step;
}
