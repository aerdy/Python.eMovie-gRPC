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
