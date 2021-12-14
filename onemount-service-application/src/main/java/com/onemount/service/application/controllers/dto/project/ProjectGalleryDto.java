package com.onemount.service.application.controllers.dto.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectGalleryDto {

    private String galleryId;
    private String category;
    private String url;
}
