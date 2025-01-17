/*
 * Copyright 2017 Kodehawa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.kodehawa.lib.imageboards.entities.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.kodehawa.lib.imageboards.entities.BoardImage;
import net.kodehawa.lib.imageboards.entities.Rating;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Kodehawa
 */
public class KonachanImage implements BoardImage {
    private String author;
    @JsonProperty("created_at")
    private long created_at;
    private long file_size;
    private String file_url;
    private int height;
    private long id;
    private long jpeg_file_size;
    private int jpeg_height;
    private String jpeg_url;
    private int jpeg_width;
    private int preview_height;
    private String preview_url;
    private int preview_width;
    private Rating rating;
    private long sample_file_size;
    private int sample_height;
    private String sample_url;
    private int sample_width;
    private int score;
    private String source;
    private String status;
    private String tags;
    @JsonProperty("has_children")
    private boolean has_children;
    @JsonProperty("is_held")
    private boolean is_held;

    public long getCreated_at() {
        return created_at;
    }

    public long getFile_size() {
        return file_size;
    }

    public String getFile_url() {
        return file_url;
    }

    public long getJpeg_file_size() {
        return jpeg_file_size;
    }

    public int getJpeg_height() {
        return jpeg_height;
    }

    public int getJpeg_width() {
        return jpeg_width;
    }

    public int getPreview_height() {
        return preview_height;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public int getPreview_width() {
        return preview_width;
    }

    public long getSample_file_size() {
        return sample_file_size;
    }

    public int getSample_height() {
        return sample_height;
    }

    public String getSample_url() {
        return sample_url;
    }

    public int getSample_width() {
        return sample_width;
    }

    public String getSource() {
        return source;
    }

    private int width;

    public String getAuthor() {
        return author;
    }

    @Override
    public long getId() {
        return id;
    }

    @JsonIgnore
    public String getParsedUrl() {
        return jpeg_url;
    }

    public String getJpeg_url() {
        return jpeg_url;
    }

    public String getStatus() {
        return status;
    }

    public boolean isHas_children() {
        return has_children;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public Rating getRating() {
        return rating;
    }

    @Override
    public List<String> getTags() {
        return tags == null ? Collections.emptyList() : Collections.unmodifiableList(Arrays.asList(tags.split(" ")));
    }

    @Override
    public String getURL() {
        return getParsedUrl();
    }

    @Override
    public boolean hasChildren() {
        return isHas_children();
    }

    @Override
    public boolean isPending() {
        return is_held;
    }

    @Override
    public long getCreationMillis() {
        return created_at * 1000;
    }
}
