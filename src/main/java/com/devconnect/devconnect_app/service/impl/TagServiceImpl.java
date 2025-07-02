package com.devconnect.devconnect_app.service.impl;

import com.devconnect.devconnect_app.dto.input.CreateTagInput;
import com.devconnect.devconnect_app.dto.input.UpdateTagInput;
import com.devconnect.devconnect_app.dto.output.TagDTO;
import com.devconnect.devconnect_app.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Override
    public List<TagDTO> getAllTags() {
        return List.of();
    }

    @Override
    public TagDTO getTag(Integer id) {
        return null;
    }

    @Override
    public TagDTO createTag(CreateTagInput createTagInput) {
        return null;
    }

    @Override
    public TagDTO updateTag(UpdateTagInput updateTagInput) {
        return null;
    }

    @Override
    public Boolean deleteTag(Integer id) {
        return null;
    }
}
