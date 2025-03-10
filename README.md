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
out json response from api themoviedb.org 
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
    },...
```

## Mobile Client Generate
<img src="https://github.com/aerdy/eMovie-gRPC/blob/main/Screenshot/Screenshot%202025-03-10%20at%2014.25.49.png" width="200">

## Screenshot
<img src="https://github.com/aerdy/eMovie-gRPC/blob/main/Screenshot/Screenshot_20250310_144621.png" width="200">


