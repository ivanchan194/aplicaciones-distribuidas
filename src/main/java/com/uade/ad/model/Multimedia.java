package com.uade.ad.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "set")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class Multimedia {
    @Id
    @GeneratedValue
    private int idContent;

    @Enumerated(EnumType.STRING)
    private ContentType contentType;

    private String fileExtension;

    private String contentUrl;

    @ManyToOne(optional = false)
    private Step step;
}
