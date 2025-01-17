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

package net.kodehawa.lib.imageboards;

import net.kodehawa.lib.imageboards.entities.BoardImage;

public class TagImages {
    public static void main(String[] args) {
        ImageBoard.setUserAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:52.0) Gecko/20100101 Firefox/52.0");

        // Asynchronous GET
        // 20 images tagged with animal_ears
        DefaultImageBoards.KONACHAN.search(20, "animal_ears").async(images -> {
            for (BoardImage image : images) System.out.println(image.getURL());
        });

        // Blocking GET
        // 60 images tagged with animal_ears
        BoardImage image = DefaultImageBoards.KONACHAN.search("animal_ears").blocking().get(0);
        System.out.println(image.getURL());
        System.out.println(image.getRating());
        System.out.println(image.getTags());
        System.out.println(image.getHeight());
        System.out.println(image.getWidth());
        System.out.println(image.getId());
        System.out.println(image.getScore());
    }
}
