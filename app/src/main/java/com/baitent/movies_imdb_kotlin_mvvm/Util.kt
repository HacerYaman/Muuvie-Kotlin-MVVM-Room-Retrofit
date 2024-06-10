package com.baitent.movies_imdb_kotlin_mvvm

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun ImageView.dowloadFromUrl(url:String?){

    val options = RequestOptions()
        .placeholder(placeholderProgressBar(context))
        .error(R.mipmap.ic_launcher_round)

    Glide.with(context).setDefaultRequestOptions(options).load(url).into(this)

}
fun placeholderProgressBar(context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 8f
        centerRadius = 48f
        start()
    }
}

/*

{
    "page": 1,
    "results": [
    {
        "adult": false,
        "backdrop_path": "/fqv8v6AycXKsivp1T5yKtLbGXce.jpg",
        "genre_ids": [
        878,
        12,
        28
        ],
        "id": 653346,
        "original_language": "en",
        "original_title": "Kingdom of the Planet of the Apes",
        "overview": "Several generations in the future following Caesar's reign, apes are now the dominant species and live harmoniously while humans have been reduced to living in the shadows. As a new tyrannical ape leader builds his empire, one young ape undertakes a harrowing journey that will cause him to question all that he has known about the past and to make choices that will define a future for apes and humans alike.",
        "popularity": 6245.898,
        "poster_path": "/gKkl37BQuKTanygYQG1pyYgLVgf.jpg",
        "release_date": "2024-05-08",
        "title": "Kingdom of the Planet of the Apes",
        "video": false,
        "vote_average": 6.89,
        "vote_count": 847
    },
    {
        "adult": false,
        "backdrop_path": "/z121dSTR7PY9KxKuvwiIFSYW8cf.jpg",
        "genre_ids": [
        10752,
        28,
        18
        ],
        "id": 929590,
        "original_language": "en",
        "original_title": "Civil War",
        "overview": "In the near future, a group of war journalists attempt to survive while reporting the truth as the United States stands on the brink of civil war.",
        "popularity": 2730.901,
        "poster_path": "/sh7Rg8Er3tFcN9BpKIPOMvALgZd.jpg",
        "release_date": "2024-04-10",
        "title": "Civil War",
        "video": false,
        "vote_average": 7.062,
        "vote_count": 1383
    },
    {
        "adult": false,
        "backdrop_path": "/xRd1eJIDe7JHO5u4gtEYwGn5wtf.jpg",
        "genre_ids": [
        878,
        28,
        12
        ],
        "id": 823464,
        "original_language": "en",
        "original_title": "Godzilla x Kong: The New Empire",
        "overview": "Following their explosive showdown, Godzilla and Kong must reunite against a colossal undiscovered threat hidden within our world, challenging their very existence – and our own.",
        "popularity": 2726.153,
        "poster_path": "/z1p34vh7dEOnLDmyCrlUVLuoDzd.jpg",
        "release_date": "2024-03-27",
        "title": "Godzilla x Kong: The New Empire",
        "video": false,
        "vote_average": 7.225,
        "vote_count": 2595
    },
    {
        "adult": false,
        "backdrop_path": "/oavbmL3iddJUmC8nQjL6bLHwAP4.jpg",
        "genre_ids": [
        27,
        53
        ],
        "id": 719221,
        "original_language": "en",
        "original_title": "Tarot",
        "overview": "When a group of friends recklessly violate the sacred rule of Tarot readings, they unknowingly unleash an unspeakable evil trapped within the cursed cards. One by one, they come face to face with fate and end up in a race against death.",
        "popularity": 2349.378,
        "poster_path": "/gAEUXC37vl1SnM7PXsHTF23I2vq.jpg",
        "release_date": "2024-05-01",
        "title": "Tarot",
        "video": false,
        "vote_average": 6.532,
        "vote_count": 385
    },
    {
        "adult": false,
        "backdrop_path": "/ga4OLm4qLxPqKLMzjJlqHxVjst3.jpg",
        "genre_ids": [
        28,
        80,
        53
        ],
        "id": 573435,
        "original_language": "en",
        "original_title": "Bad Boys: Ride or Die",
        "overview": "After their late former Captain is framed, Lowrey and Burnett try to clear his name, only to end up on the run themselves.",
        "popularity": 2486.516,
        "poster_path": "/nP6RliHjxsz4irTKsxe8FRhKZYl.jpg",
        "release_date": "2024-06-05",
        "title": "Bad Boys: Ride or Die",
        "video": false,
        "vote_average": 7.652,
        "vote_count": 92
    },
    {
        "adult": false,
        "backdrop_path": "/3TNSoa0UHGEzEz5ndXGjJVKo8RJ.jpg",
        "genre_ids": [
        878,
        28
        ],
        "id": 614933,
        "original_language": "en",
        "original_title": "Atlas",
        "overview": "A brilliant counterterrorism analyst with a deep distrust of AI discovers it might be her only hope when a mission to capture a renegade robot goes awry.",
        "popularity": 1828.902,
        "poster_path": "/bcM2Tl5HlsvPBnL8DKP9Ie6vU4r.jpg",
        "release_date": "2024-05-23",
        "title": "Atlas",
        "video": false,
        "vote_average": 6.732,
        "vote_count": 658
    },
    {
        "adult": false,
        "backdrop_path": "/H5HjE7Xb9N09rbWn1zBfxgI8uz.jpg",
        "genre_ids": [
        28,
        35
        ],
        "id": 746036,
        "original_language": "en",
        "original_title": "The Fall Guy",
        "overview": "Fresh off an almost career-ending accident, stuntman Colt Seavers has to track down a missing movie star, solve a conspiracy and try to win back the love of his life while still doing his day job.",
        "popularity": 1382.602,
        "poster_path": "/tSz1qsmSJon0rqjHBxXZmrotuse.jpg",
        "release_date": "2024-04-24",
        "title": "The Fall Guy",
        "video": false,
        "vote_average": 7.277,
        "vote_count": 1105
    },
    {
        "adult": false,
        "backdrop_path": "/uVu2fBc114un7F1GD76RBouWyBP.jpg",
        "genre_ids": [
        16,
        10751,
        18,
        12,
        35
        ],
        "id": 1022789,
        "original_language": "en",
        "original_title": "Inside Out 2",
        "overview": "Teenager Riley's mind headquarters is undergoing a sudden demolition to make room for something entirely unexpected: new Emotions! Joy, Sadness, Anger, Fear and Disgust, who’ve long been running a successful operation by all accounts, aren’t sure how to feel when Anxiety shows up. And it looks like she’s not alone.",
        "popularity": 1350.605,
        "poster_path": "/vpnVM9B6NMmQpWeZvzLvDESb2QY.jpg",
        "release_date": "2024-06-12",
        "title": "Inside Out 2",
        "video": false,
        "vote_average": 8,
        "vote_count": 12
    },
    {
        "adult": false,
        "backdrop_path": "/tkHQ7tnYYUEnqlrKuhufIsSVToU.jpg",
        "genre_ids": [
        27
        ],
        "id": 437342,
        "original_language": "en",
        "original_title": "The First Omen",
        "overview": "When a young American woman is sent to Rome to begin a life of service to the church, she encounters a darkness that causes her to question her own faith and uncovers a terrifying conspiracy that hopes to bring about the birth of evil incarnate.",
        "popularity": 1389.513,
        "poster_path": "/uGyiewQnDHPuiHN9V4k2t9QBPnh.jpg",
        "release_date": "2024-04-03",
        "title": "The First Omen",
        "video": false,
        "vote_average": 6.787,
        "vote_count": 436
    },
    {
        "adult": false,
        "backdrop_path": "/11G6N5zW0KykVS0EcNKeXHUmQj8.jpg",
        "genre_ids": [
        10752
        ],
        "id": 1136318,
        "original_language": "en",
        "original_title": "Battle Over Britain",
        "overview": "A young pilot, fresh out of training, is called to join a Flight while they wait for the call to scramble. Throughout a single day, he witnesses the skies of southern England filled with deadly dog fights, and after every exhausting battle the men return to their dispersal hut, only to find another of their number missing. Unwilling to surrender, the pilot and his comrades unite to take to the skies once more, determined to defend not only the airfield, but their entire country.",
        "popularity": 1217.246,
        "poster_path": "/8htJ7keZTwa08aC9OKyiqaq1cNJ.jpg",
        "release_date": "2023-12-01",
        "title": "Battle Over Britain",
        "video": false,
        "vote_average": 6.417,
        "vote_count": 12
    },
    {
        "adult": false,
        "backdrop_path": "/kYgQzzjNis5jJalYtIHgrom0gOx.jpg",
        "genre_ids": [
        16,
        28,
        10751,
        35,
        14
        ],
        "id": 1011985,
        "original_language": "en",
        "original_title": "Kung Fu Panda 4",
        "overview": "Po is gearing up to become the spiritual leader of his Valley of Peace, but also needs someone to take his place as Dragon Warrior. As such, he will train a new kung fu practitioner for the spot and will encounter a villain called the Chameleon who conjures villains from the past.",
        "popularity": 1061.125,
        "poster_path": "/kDp1vUBnMpe8ak4rjgl3cLELqjU.jpg",
        "release_date": "2024-03-02",
        "title": "Kung Fu Panda 4",
        "video": false,
        "vote_average": 7.126,
        "vote_count": 1921
    },
    {
        "adult": false,
        "backdrop_path": "/shrwC6U8Bkst9T9J7fr1A50n6x6.jpg",
        "genre_ids": [
        28,
        12,
        878
        ],
        "id": 786892,
        "original_language": "en",
        "original_title": "Furiosa: A Mad Max Saga",
        "overview": "As the world fell, young Furiosa is snatched from the Green Place of Many Mothers and falls into the hands of a great Biker Horde led by the Warlord Dementus. Sweeping through the Wasteland they come across the Citadel presided over by The Immortan Joe. While the two Tyrants war for dominance, Furiosa must survive many trials as she puts together the means to find her way home.",
        "popularity": 1122.616,
        "poster_path": "/iADOJ8Zymht2JPMoy3R7xceZprc.jpg",
        "release_date": "2024-05-22",
        "title": "Furiosa: A Mad Max Saga",
        "video": false,
        "vote_average": 7.691,
        "vote_count": 781
    },
    {
        "adult": false,
        "backdrop_path": "/iafs5DG5fGq7ef0acl3xlX4BFrs.jpg",
        "genre_ids": [
        18,
        10770
        ],
        "id": 1219685,
        "original_language": "fr",
        "original_title": "Un père idéal",
        "overview": "",
        "popularity": 818.389,
        "poster_path": "/4xJd3uwtL1vCuZgEfEc8JXI9Uyx.jpg",
        "release_date": "2024-04-21",
        "title": "Un père idéal",
        "video": false,
        "vote_average": 5.695,
        "vote_count": 41
    },
    {
        "adult": false,
        "backdrop_path": "/fY3lD0jM5AoHJMunjGWqJ0hRteI.jpg",
        "genre_ids": [
        878,
        27,
        28
        ],
        "id": 940721,
        "original_language": "ja",
        "original_title": "ゴジラ-1.0",
        "overview": "In postwar Japan, Godzilla brings new devastation to an already scorched landscape. With no military intervention or government help in sight, the survivors must join together in the face of despair and fight back against an unrelenting horror.",
        "popularity": 898.788,
        "poster_path": "/hkxxMIGaiCTmrEArK7J56JTKUlB.jpg",
        "release_date": "2023-11-03",
        "title": "Godzilla Minus One",
        "video": false,
        "vote_average": 7.633,
        "vote_count": 1561
    },
    {
        "adult": false,
        "backdrop_path": "/1m1rXopfNDVL3UMiv6kriYaJ3yE.jpg",
        "genre_ids": [
        28,
        53,
        80,
        878
        ],
        "id": 882059,
        "original_language": "en",
        "original_title": "Boy Kills World",
        "overview": "When his family is murdered, a deaf-mute named Boy escapes to the jungle and is trained by a mysterious shaman to repress his childish imagination and become an instrument of death.",
        "popularity": 934.001,
        "poster_path": "/25JskXmchcYwj3jHRmcPm738MpB.jpg",
        "release_date": "2024-04-24",
        "title": "Boy Kills World",
        "video": false,
        "vote_average": 6.897,
        "vote_count": 258
    },
    {
        "adult": false,
        "backdrop_path": "/xOMo8BRK7PfcJv9JCnx7s5hj0PX.jpg",
        "genre_ids": [
        878,
        12
        ],
        "id": 693134,
        "original_language": "en",
        "original_title": "Dune: Part Two",
        "overview": "Follow the mythic journey of Paul Atreides as he unites with Chani and the Fremen while on a path of revenge against the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the known universe, Paul endeavors to prevent a terrible future only he can foresee.",
        "popularity": 903.033,
        "poster_path": "/1pdfLvkbY9ohJlCjQH2CZjjYVvJ.jpg",
        "release_date": "2024-02-27",
        "title": "Dune: Part Two",
        "video": false,
        "vote_average": 8.169,
        "vote_count": 4399
    },
    {
        "adult": false,
        "backdrop_path": "/b93N6Mb08NhFhobB8KrR5GBaPP5.jpg",
        "genre_ids": [
        878,
        27
        ],
        "id": 969686,
        "original_language": "en",
        "original_title": "4 Horsemen: Apocalypse",
        "overview": "A small team of scientists must race against time to stop what seems to be a cascade of global disasters signaling the possible apocalypse and end of days.",
        "popularity": 920.018,
        "poster_path": "/dt3mo4tArf2llDiht91cnvUtSgT.jpg",
        "release_date": "2022-04-29",
        "title": "4 Horsemen: Apocalypse",
        "video": false,
        "vote_average": 5.66,
        "vote_count": 78
    },
    {
        "adult": false,
        "backdrop_path": "/s9hW1DHfgy5ppK1fTUJuMKh4YFK.jpg",
        "genre_ids": [
        28,
        53
        ],
        "id": 980083,
        "original_language": "en",
        "original_title": "Top Gunner: Danger Zone",
        "overview": "An airliner filled with 800 passengers is forced to fly fast and low, above farmlands, suburbs and skyscraper-packed cities or the tons of explosives aboard will detonate. When an elite unit of US Air Force fighter jets is sent to provide escort, they find themselves facing a squadron of unidentifiable warplanes which ignites a deadly air battle that threatens to destroy all life above and below.",
        "popularity": 859.294,
        "poster_path": "/29UCk1nvPzn2XubLk5rKDMlHBRu.jpg",
        "release_date": "2022-05-20",
        "title": "Top Gunner: Danger Zone",
        "video": false,
        "vote_average": 4,
        "vote_count": 13
    },
    {
        "adult": false,
        "backdrop_path": "/vWzJDjLPmycnQ42IppEjMpIhrhc.jpg",
        "genre_ids": [
        16,
        35,
        10751,
        12
        ],
        "id": 748783,
        "original_language": "en",
        "original_title": "The Garfield Movie",
        "overview": "Garfield, the world-famous, Monday-hating, lasagna-loving indoor cat, is about to have a wild outdoor adventure! After an unexpected reunion with his long-lost father – scruffy street cat Vic – Garfield and his canine friend Odie are forced from their perfectly pampered life into joining Vic in a hilarious, high-stakes heist.",
        "popularity": 798.717,
        "poster_path": "/p6AbOJvMQhBmffd0PIv0u8ghWeY.jpg",
        "release_date": "2024-04-30",
        "title": "The Garfield Movie",
        "video": false,
        "vote_average": 6.4,
        "vote_count": 154
    },
    {
        "adult": false,
        "backdrop_path": "/j29ekbcLpBvxnGk6LjdTc2EI5SA.jpg",
        "genre_ids": [
        16,
        10751,
        12,
        18,
        35
        ],
        "id": 150540,
        "original_language": "en",
        "original_title": "Inside Out",
        "overview": "From an adventurous balloon ride above the clouds to a monster-filled metropolis, Academy Award®-winning director Pete Docter (“Monsters, Inc.,” “Up”) has taken audiences to unique and imaginative places. In Disney and Pixar’s original movie “ Inside Out,” he will take us to the most extraordinary location of all—inside the mind.",
        "popularity": 694.584,
        "poster_path": "/2H1TmgdfNtsKlU9jKdeNyYL5y8T.jpg",
        "release_date": "2015-06-09",
        "title": "Inside Out",
        "video": false,
        "vote_average": 7.9,
        "vote_count": 20441
    }
    ],
    "total_pages": 44596,
    "total_results": 891918
}   */