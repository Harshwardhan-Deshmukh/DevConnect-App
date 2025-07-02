package com.devconnect.devconnect_app.service;

import com.devconnect.devconnect_app.dto.input.CreateTagInput;
import com.devconnect.devconnect_app.dto.input.UpdateTagInput;
import com.devconnect.devconnect_app.dto.output.TagDTO;

import java.util.List;

public interface TagService {
    List<TagDTO> getAllTags();
    TagDTO getTag(Integer id);
    TagDTO createTag(CreateTagInput createTagInput);
    TagDTO updateTag(UpdateTagInput updateTagInput);
    Boolean deleteTag(Integer id);
}
