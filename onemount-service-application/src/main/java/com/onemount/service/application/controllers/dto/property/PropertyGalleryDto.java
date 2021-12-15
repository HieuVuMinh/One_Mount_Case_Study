package com.onemount.service.application.controllers.dto.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyGalleryDto {

    private String id;
    private String mediaType;
    private String category;
    private String urls;
}
