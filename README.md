# GRPC Python 

## Generate Proto3 Code
add terminal

> SRC_DIR=is source directory ex : "/users/me/code"

> DST_DIR=is destination directory ex : "/users/me/code"

> protoc --proto_path=$SRC_DIR --python_out=$DST_DIR $SRC_DIR/movie.proto

this generated automatic created file 'movie_pb2.py'
## Generate gRPC Code
add terminal

> python3 -m grpc_tools.protoc --proto_path=$SRC_DIR --python_out=. --pyi_out=. --grpc_python_out=. movie.proto

this generated automatic create file 'movie_pb2_grpc.py'

## Run
add terminal 
> python movie_server.py

> python movie_client.py

## Output

```JSON
{
  "dates": {
    "maximum": "2025-03-05",
    "minimum": "2025-01-22"
  },
  "page": 1,
  "results": [
    {
      "adult": false,
      "backdrop_path": "/9nhjGaFLKtddDPtPaX5EmKqsWdH.jpg",
      "genre_ids": [
        10749,
        878,
        53
      ],
      "id": 950396,
      "original_language": "en",
      "original_title": "The Gorge",
      "overview": "Two highly trained operatives grow close from a distance after being sent to guard opposite sides of a mysterious gorge. When an evil below emerges, they must work together to survive what lies within.",
      "popularity": 2462.807,
      "poster_path": "/7iMBZzVZtG0oBug4TfqDb9ZxAOa.jpg",
      "release_date": "2025-02-13",
      "title": "The Gorge",
      "video": false,
      "vote_average": 7.829,
      "vote_count": 1362
    },
    {
      "adult": false,
      "backdrop_path": "/rOMLLMGgDgGG6XeT3P8sUdUb8nl.jpg",
      "genre_ids": [
        28,
        53,
        80
      ],
      "id": 1126166,
      "original_language": "en",
      "original_title": "Flight Risk",
      "overview": "A U.S. Marshal escorts a government witness to trial after he's accused of getting involved with a mob boss, only to discover that the pilot who is transporting them is also a hitman sent to assassinate the informant. After they subdue him, they're forced to fly together after discovering that there are others attempting to eliminate them.",
      "popularity": 1501.8,
      "poster_path": "/4cR3hImKd78dSs652PAkSAyJ5Cx.jpg",
      "release_date": "2025-01-22",
      "title": "Flight Risk",
      "video": false,
      "vote_average": 5.8,
      "vote_count": 249
    },
    {
      "adult": false,
      "backdrop_path": "/qfAfE5auxsuxhxPpnETRAyTP5ff.jpg",
      "genre_ids": [
        28,
        53,
        878
      ],
      "id": 822119,
      "original_language": "en",
      "original_title": "Captain America: Brave New World",
      "overview": "After meeting with newly elected U.S. President Thaddeus Ross, Sam finds himself in the middle of an international incident. He must discover the reason behind a nefarious global plot before the true mastermind has the entire world seeing red.",
      "popularity": 946.019,
      "poster_path": "/pzIddUEMWhWzfvLI3TwxUG2wGoi.jpg",
      "release_date": "2025-02-12",
      "title": "Captain America: Brave New World",
      "video": false,
      "vote_average": 6.191,
      "vote_count": 757
    },
    {
      "adult": false,
      "backdrop_path": "/zOpe0eHsq0A2NvNyBbtT6sj53qV.jpg",
      "genre_ids": [
        28,
        878,
        35,
        10751
      ],
      "id": 939243,
      "original_language": "en",
      "original_title": "Sonic the Hedgehog 3",
      "overview": "Sonic, Knuckles, and Tails reunite against a powerful new adversary, Shadow, a mysterious villain with powers unlike anything they have faced before. With their abilities outmatched in every way, Team Sonic must seek out an unlikely alliance in hopes of stopping Shadow and protecting the planet.",
      "popularity": 1172.898,
      "poster_path": "/d8Ryb8AunYAuycVKDp5HpdWPKgC.jpg",
      "release_date": "2024-12-19",
      "title": "Sonic the Hedgehog 3",
      "video": false,
      "vote_average": 7.8,
      "vote_count": 1989
    },
    {
      "adult": false,
      "backdrop_path": "/u7AZ5CdT2af8buRjmYCPXNyJssd.jpg",
      "genre_ids": [
        28,
        35
      ],
      "id": 1160956,
      "original_language": "zh",
      "original_title": "熊猫计划",
      "overview": "International action star Jackie Chan is invited to the adoption ceremony of a rare baby panda, but after an international crime syndicate attempts to kidnap the bear, Jackie has to save the bear using his stunt work skills.",
      "popularity": 782.687,
      "poster_path": "/xVS9XiO9upp2SnWx6KpBYb79hLR.jpg",
      "release_date": "2024-10-01",
      "title": "Panda Plan",
      "video": false,
      "vote_average": 7,
      "vote_count": 142
    },
    {
      "adult": false,
      "backdrop_path": "/hfTyu2VPBqLRPo2DauW8q7bh9bm.jpg",
      "genre_ids": [
        10751,
        12,
        35
      ],
      "id": 516729,
      "original_language": "en",
      "original_title": "Paddington in Peru",
      "overview": "Paddington travels to Peru to visit his beloved Aunt Lucy, who now resides at the Home for Retired Bears. With the Brown Family in tow, a thrilling adventure ensues when a mystery plunges them into an unexpected journey through the Amazon rainforest and up to the mountain peaks of Peru. Watch Here : https://justwatch.pro/movie/516729/paddington-in-peru",
      "popularity": 528.653,
      "poster_path": "/1ffZAucqfvQu36x1C49XfOdjuOG.jpg",
      "release_date": "2024-11-08",
      "title": "Paddington in Peru",
      "video": false,
      "vote_average": 6.8,
      "vote_count": 158
    },
    {
      "adult": false,
      "backdrop_path": "/sc1abgWNXc29wSBaerrjGBih06l.jpg",
      "genre_ids": [
        878,
        53
      ],
      "id": 1084199,
      "original_language": "en",
      "original_title": "Companion",
      "overview": "During a weekend getaway at a secluded lakeside estate, a group of friends finds themselves entangled in a web of secrets, deception, and advanced technology. As tensions rise and loyalties are tested, they uncover unsettling truths about themselves and the world around them.",
      "popularity": 726.788,
      "poster_path": "/oCoTgC3UyWGfyQ9thE10ulWR7bn.jpg",
      "release_date": "2025-01-22",
      "title": "Companion",
      "video": false,
      "vote_average": 7,
      "vote_count": 526
    },
    {
      "adult": false,
      "backdrop_path": "/iXU87IdtNsYt7n6OigPJBDdbFf1.jpg",
      "genre_ids": [
        10751,
        16,
        35,
        28
      ],
      "id": 774370,
      "original_language": "en",
      "original_title": "Dog Man",
      "overview": "When a faithful police dog and his human police officer owner are injured together on the job, a harebrained but life-saving surgery fuses the two of them together and Dog Man is born. Dog Man is sworn to protect and serve—and fetch, sit and roll over. As Dog Man embraces his new identity and strives to impress his Chief, he must stop the pretty evil plots of feline supervillain Petey the Cat.",
      "popularity": 498.463,
      "poster_path": "/89wNiexZdvLQ41OQWIsQy4O6jAQ.jpg",
      "release_date": "2025-01-24",
      "title": "Dog Man",
      "video": false,
      "vote_average": 7.9,
      "vote_count": 105
    },
    {
      "adult": false,
      "backdrop_path": "/uJK0jjJ8QDOQw5lcNBwu059ht4D.jpg",
      "genre_ids": [
        10749,
        18
      ],
      "id": 1294203,
      "original_language": "en",
      "original_title": "My Fault: London",
      "overview": "18-year-old Noah moves from America to London, with her mother who's recently fallen in love with William, a wealthy British businessman. Noah meets William’s son, bad-boy Nick, and soon discovers there is an attraction between them neither can avoid. As Noah spends the summer adjusting to her new life, her devastating past will catch up with her while falling in love for the first time.",
      "popularity": 658.036,
      "poster_path": "/ttN5D6GKOwKWHmCzDGctAvaNMAi.jpg",
      "release_date": "2025-02-12",
      "title": "My Fault: London",
      "video": false,
      "vote_average": 7.5,
      "vote_count": 242
    },
    {
      "adult": false,
      "backdrop_path": "/v9Du2HC3hlknAvGlWhquRbeifwW.jpg",
      "genre_ids": [
        28,
        12,
        53
      ],
      "id": 539972,
      "original_language": "en",
      "original_title": "Kraven the Hunter",
      "overview": "Kraven Kravinoff's complex relationship with his ruthless gangster father, Nikolai, starts him down a path of vengeance with brutal consequences, motivating him to become not only the greatest hunter in the world, but also one of its most feared.",
      "popularity": 617.798,
      "poster_path": "/nrlfJoxP1EkBVE9pU62L287Jl4D.jpg",
      "release_date": "2024-12-11",
      "title": "Kraven the Hunter",
      "video": false,
      "vote_average": 6.667,
      "vote_count": 1299
    },
    {
      "adult": false,
      "backdrop_path": "/vfkzNcVzTRCq3C2jYIZtIjSdwf7.jpg",
      "genre_ids": [
        27,
        53,
        28
      ],
      "id": 1247019,
      "original_language": "th",
      "original_title": "ธี่หยด 2",
      "overview": "Three years after his sister's death, Yak relentlessly searches for the dark spirit that killed her in hopes of seeking revenge.",
      "popularity": 457.729,
      "poster_path": "/uDW5eeFUYp1vaU2ymEdVBG6g7iq.jpg",
      "release_date": "2024-10-10",
      "title": "Death Whisperer 2",
      "video": false,
      "vote_average": 7.02,
      "vote_count": 74
    },
    {
      "adult": false,
      "backdrop_path": "/qSOMdbZ6AOdHR999HWwVAh6ALFI.jpg",
      "genre_ids": [
        28,
        80,
        53
      ],
      "id": 1249289,
      "original_language": "en",
      "original_title": "Alarum",
      "overview": "Two married spies caught in the crosshairs of an international intelligence network will stop at nothing to obtain a critical asset. Joe and Lara are agents living off the grid whose quiet retreat at a winter resort is blown to shreds when members of the old guard suspect the two may have joined an elite team of rogue spies, known as Alarum. Watch Here : https://justwatch.pro/movie/1249289/alarum",
      "popularity": 443.24,
      "poster_path": "/v313aUGmMNj6yNveaiQXysBmjVS.jpg",
      "release_date": "2025-01-16",
      "title": "Alarum",
      "video": false,
      "vote_average": 5.8,
      "vote_count": 214
    },
    {
      "adult": false,
      "backdrop_path": "/nNF4ZB0UDL4qAUjQfbYZDq3Ck7J.jpg",
      "genre_ids": [
        27,
        53
      ],
      "id": 710295,
      "original_language": "en",
      "original_title": "Wolf Man",
      "overview": "With his marriage fraying, Blake persuades his wife Charlotte to take a break from the city and visit his remote childhood home in rural Oregon. As they arrive at the farmhouse in the dead of night, they're attacked by an unseen animal and barricade themselves inside the home as the creature prowls the perimeter. But as the night stretches on, Blake begins to behave strangely, transforming into something unrecognizable.",
      "popularity": 308.533,
      "poster_path": "/vtdEHG1j07PqLlVyhKNZRHTPKGt.jpg",
      "release_date": "2025-01-15",
      "title": "Wolf Man",
      "video": false,
      "vote_average": 6.515,
      "vote_count": 439
    },
    {
      "adult": false,
      "backdrop_path": "/mwLsawcvd2ocT93mk9fEW4JGaYp.jpg",
      "genre_ids": [
        18
      ],
      "id": 549509,
      "original_language": "en",
      "original_title": "The Brutalist",
      "overview": "Escaping post-war Europe, visionary architect László Toth arrives in America to rebuild his life, his work, and his marriage to his wife Erzsébet after being forced apart during wartime by shifting borders and regimes. On his own in a strange new country, László settles in Pennsylvania, where the wealthy and prominent industrialist Harrison Lee Van Buren recognizes his talent for building. But power and legacy come at a heavy cost.",
      "popularity": 418.979,
      "poster_path": "/vP7Yd6couiAaw9jgMd5cjMRj3hQ.jpg",
      "release_date": "2024-12-20",
      "title": "The Brutalist",
      "video": false,
      "vote_average": 7,
      "vote_count": 558
    },
    {
      "adult": false,
      "backdrop_path": "/l2QSVFR5aLcW1Vl4cGKrQkEp6fY.jpg",
      "genre_ids": [
        35,
        10749,
        28
      ],
      "id": 1201012,
      "original_language": "hi",
      "original_title": "धूम धाम",
      "overview": "On their wedding night, an oddball couple is thrust into a chaotic chase, dodging goons and cops in a frenzied hunt for the mysterious \"Charlie.\"",
      "popularity": 356.054,
      "poster_path": "/2E7me3rPi8HqaeheuD86YlpNX6k.jpg",
      "release_date": "2025-02-13",
      "title": "Dhoom Dhaam",
      "video": false,
      "vote_average": 6.7,
      "vote_count": 14
    },
    {
      "adult": false,
      "backdrop_path": "/pqulyfkug9A7TmmRn5zrbRA8TAY.jpg",
      "genre_ids": [
        28,
        35
      ],
      "id": 1255788,
      "original_language": "fr",
      "original_title": "Le Jardinier",
      "overview": "Every year the Prime Minister has a list of all kinds of troublemakers eliminated in the name of the famous Reason of State. Serge Shuster, Special Adviser to the President of the Republic, finds himself on this list, better known as the Matignon List.  Condemned to certain death and at the heart of an implacable plot and a state secret that also put his family in danger, Serge, his wife and children have only one hope left - their gardener, Léo, who hates it when « slugs » invade his garden... Especially those that want to kill innocent families.",
      "popularity": 297.804,
      "poster_path": "/5T9WR7vIOnHm6xhVt5zBuPbBgt1.jpg",
      "release_date": "2025-01-30",
      "title": "The Gardener",
      "video": false,
      "vote_average": 6.3,
      "vote_count": 84
    },
    {
      "adult": false,
      "backdrop_path": "/h7r6LZ32dgLwtwSW3CxoWIYD9pr.jpg",
      "genre_ids": [
        14,
        27
      ],
      "id": 426063,
      "original_language": "en",
      "original_title": "Nosferatu",
      "overview": "A gothic tale of obsession between a haunted young woman and the terrifying vampire infatuated with her, causing untold horror in its wake.",
      "popularity": 252.473,
      "poster_path": "/5qGIxdEO841C0tdY8vOdLoRVrr0.jpg",
      "release_date": "2024-12-25",
      "title": "Nosferatu",
      "video": false,
      "vote_average": 6.679,
      "vote_count": 2225
    },
    {
      "adult": false,
      "backdrop_path": "/tehewlwOPFDDf4syutyopaY23AY.jpg",
      "genre_ids": [
        27
      ],
      "id": 1352774,
      "original_language": "en",
      "original_title": "Piglet",
      "overview": "On Kate's 21st birthday camping trip, her friends encounter Piglet, a monstrous human-pig hybrid who brutally murders one of them. They uncover Piglet's origins and Kate must confront her past to survive the relentless killer.",
      "popularity": 244.971,
      "poster_path": "/5wZNFUJAwyX6RCxdqrLO9lLWJ20.jpg",
      "release_date": "2025-01-25",
      "title": "Piglet",
      "video": false,
      "vote_average": 5.7,
      "vote_count": 10
    },
    {
      "adult": false,
      "backdrop_path": "/cA88pwGnHa64BBcU3R1oCcJH9Qc.jpg",
      "genre_ids": [
        28,
        27,
        53
      ],
      "id": 970450,
      "original_language": "en",
      "original_title": "Werewolves",
      "overview": "A year after a supermoon’s light activated a dormant gene, transforming humans into bloodthirsty werewolves and causing nearly a billion deaths, the nightmare resurfaces as the supermoon rises again. Two scientists attempt to stop the mutation but fail and must now struggle to reach one of their family homes.",
      "popularity": 226.551,
      "poster_path": "/cRTctVlwvMdXVsaYbX5qfkittDP.jpg",
      "release_date": "2024-12-04",
      "title": "Werewolves",
      "video": false,
      "vote_average": 6.2,
      "vote_count": 318
    },
    {
      "adult": false,
      "backdrop_path": "/9oYdz5gDoIl8h67e3ccv3OHtmm2.jpg",
      "genre_ids": [
        27,
        878
      ],
      "id": 933260,
      "original_language": "en",
      "original_title": "The Substance",
      "overview": "A fading celebrity decides to use a black market drug, a cell-replicating substance that temporarily creates a younger, better version of herself.",
      "popularity": 224.742,
      "poster_path": "/cGm2qnmXx9tFabmzEIkJZjCJdQd.jpg",
      "release_date": "2024-09-07",
      "title": "The Substance",
      "video": false,
      "vote_average": 7.1,
      "vote_count": 3939
    }
  ],
  "total_pages": 205,
  "total_results": 4093
}
```
