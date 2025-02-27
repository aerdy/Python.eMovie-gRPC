from __future__ import print_function

import logging

import grpc
import movie_pb2 as proto
import movie_pb2_grpc as grpc_server


def run():
    with grpc.insecure_channel("localhost:50051") as channel:
        stub = grpc_server.MovieStub(channel)
        response = stub.ListMovie(proto.MovieRequest())
    print(response.message)


if __name__ == "__main__":
    logging.basicConfig()
    run()
