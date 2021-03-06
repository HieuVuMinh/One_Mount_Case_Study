package com.onemount.service.business.domain.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectGallery {

    private String galleryId;
    private String category;
    private String url;
}
