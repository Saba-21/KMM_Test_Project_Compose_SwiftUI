package com.example.kmm_sample.api.impl

import com.example.kmm_sample.api.ImageData
import com.example.kmm_sample.api.ImagesDataSource

class ImagesDataSourceImpl : ImagesDataSource {

    override fun getImages(): List<ImageData> {
        return listOf(
            ImageData(
                id = 0,
                location = "Amsterdam, Netherlands",
                tags = listOf(
                    "amsterdam",
                    "netherlands",
                    "building",
                    "Tree Images & Pictures",
                    "europe",
                    "urban",
                    "neighborhood",
                    "bike",
                    "bicycle",
                    "House Images",
                    "home",
                    "apartment building",
                    "road",
                    "street",
                    "Travel Images",
                    "canal",
                    "wall",
                    "shop",
                    "store",
                    "Backgrounds"
                ),
                url = "image_1",
                isLiked = false
            ),
            ImageData(
                id = 1,
                location = "Amsterdam, Netherlands",
                tags = listOf(
                    "amsterdam",
                    "netherlands",
                    "HD Water Wallpapers",
                    "boat",
                    "Travel Images",
                    "outdoors",
                    "building",
                    "Tree Images & Pictures",
                    "sail",
                    "ripple",
                    "calm",
                    "perspective",
                    "transport",
                    "architecture",
                    "traditional design",
                    "trip",
                    "sunlight",
                    "Tree Images & Pictures"
                ),
                url = "image_2",
                isLiked = false
            ),
            ImageData(
                id = 2,
                location = "Amsterdam, Netherlands",
                tags = listOf(
                    "amsterdam",
                    "netherlands",
                    "canal",
                    "building",
                    "river",
                    "architecture",
                    "boat",
                    "reflection",
                    "evening",
                    "dusk",
                    "boats",
                    "House Images",
                    "outdoors",
                    "automobile",
                    "vehicle",
                    "Car Images & Pictures",
                    "transportation"
                ),
                url = "image_3",
                isLiked = false
            ),
            ImageData(
                id = 3,
                location = "Amsterdam, Netherlands",
                tags = listOf(
                    "amsterdam",
                    "netherlands",
                    "nederland",
                    "holland",
                    "canalsm",
                    "outdoors",
                    "canal",
                    "street",
                    "town",
                    "urban",
                    "building",
                    "alleyway",
                    "alley",
                    "road",
                    "transportation",
                    "vessel",
                    "watercraft"
                ),
                url = "image_4",
                isLiked = false
            ),
            ImageData(
                id = 4,
                location = "Stockholm, Sweden",
                tags = listOf(
                    "stockholm",
                    "schweden",
                    "downtown",
                    "street",
                    "sweden",
                    "old city",
                    "Travel Images",
                    "alley",
                    "historic city",
                    "traveling",
                    "old",
                    "old town",
                    "historic",
                    "nordic",
                    "building",
                    "urban"
                ),
                url = "image_5",
                isLiked = false
            ),
            ImageData(
                id = 5,
                location = "Stockholm, Sweden",
                tags = listOf(
                    "stockholm",
                    "sweden",
                    "walkway",
                    "pavement",
                    "sidewalk",
                    "cobblestone",
                    "building",
                    "town",
                    "street",
                    "road",
                    "urban",
                    "outdoors"
                ),
                url = "image_6",
                isLiked = false
            ),
            ImageData(
                id = 6,
                location = "Stockholm, Sweden",
                tags = listOf(
                    "stockholm",
                    "sweden",
                    "urban",
                    "architecture",
                    "streets",
                    "bridge",
                    "lifestyle",
                    "adventure",
                    "building",
                    "town",
                    "downtown",
                    "road"
                ),
                url = "image_7",
                isLiked = false
            ),
            ImageData(
                id = 7,
                location = "New York, NY",
                tags = listOf(
                    "financial district",
                    "building",
                    "downtown",
                    "nyc",
                    "urban",
                    "manhattan",
                    "skyscraper"
                ),
                url = "image_8",
                isLiked = false
            ),
            ImageData(
                id = 8,
                location = "New York, NY",
                tags = listOf(
                    "street",
                    "manhattan",
                    "nyc"
                ),
                url = "image_9",
                isLiked = false
            ),
            ImageData(
                id = 9,
                location = "New York, NY",
                tags = listOf(
                    "bridge",
                    "brooklyn"
                ),
                url = "image_10",
                isLiked = false
            ),
            ImageData(
                id = 10,
                location = "Kiawah Island, South Carolina",
                tags = listOf("golf"),
                url = "image_11",
                isLiked = false
            ),
            ImageData(
                id = 11,
                location = "Constitution Square - Tower I, Ottawa, Canada",
                tags = listOf(
                    "architecture",
                    "ottawa",
                    "canada",
                    "building",
                    "constitution square - tower i",
                    "urban",
                    "skyscraper",
                    "tower",
                    "glass",
                    "wide",
                    "symmetrical"
                ),
                url = "image_12",
                isLiked = false
            ),
            ImageData(
                id = 12,
                location = "The Rock and Roll Hall of Fame and Museum, Cleveland, United States",
                tags = listOf(
                    "architecture",
                    "building",
                    "cleveland",
                    "the rock and roll hall of fame and museum",
                    "minimalistic",
                    "minimalism",
                    "minimal",
                    "geometry",
                    "grid",
                    "line",
                    "urban",
                    "contemporary",
                    "structure",
                    "hall",
                    "contrast"
                ),
                url = "image_13",
                isLiked = false
            ),
            ImageData(
                id = 13,
                location = "Melbourne VIC, Australia",
                tags = listOf(
                    "indoors",
                    "interior",
                    "melbourne vic"
                ),
                url = "image_14",
                isLiked = false
            ),
            ImageData(
                id = 14,
                location = "New York, NY",
                tags = listOf("nyc"),
                url = "image_15",
                isLiked = false
            ),
            ImageData(
                id = 15,
                location = "Melbourne VIC, Australia",
                tags = listOf(
                    "melbourne vic",
                    "australia",
                    "housing"
                ),
                url = "image_16",
                isLiked = false
            ),
            ImageData(
                id = 16,
                location = "Charnwood, United Kingdom",
                tags = listOf(
                    "home",
                    "charnwood"
                ),
                url = "image_17",
                isLiked = false
            ),
            ImageData(
                id = 17,
                location = "Knoxville, Tennessee",
                tags = listOf(
                    "rain",
                    "cozy"
                ),
                url = "image_18",
                isLiked = false
            ),
            ImageData(
                id = 18,
                location = "Lviv, Ukraine",
                tags = listOf(
                    "reading"
                ),
                url = "image_19",
                isLiked = false
            ),
            ImageData(
                id = 19,
                location = null,
                tags = listOf("window"),
                url = "image_20",
                isLiked = false
            ),
            ImageData(
                id = 20,
                location = null,
                tags = listOf("window"),
                url = "image_21",
                isLiked = false
            ),
            ImageData(
                id = 21,
                location = "Trinity College, Dublin, Ireland",
                tags = listOf(
                    "library",
                    "dublin"
                ),
                url = "image_22",
                isLiked = false
            ),
            ImageData(
                id = 22,
                location = "Paris, France",
                tags = listOf(
                    "library"
                ),
                url = "image_23",
                isLiked = false
            ),
            ImageData(
                id = 23,
                location = "Rijksmuseum, Amsterdam, Netherlands",
                tags = listOf("library"),
                url = "image_24",
                isLiked = false
            ),
            ImageData(
                id = 24,
                location = "Trinity, Ireland",
                tags = listOf(
                    "library",
                    "trinity"
                ),
                url = "image_25",
                isLiked = false
            )
        )

    }

}