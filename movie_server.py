from concurrent import futures
import logging

import grpc
import movie_pb2 as proto
import movie_pb2_grpc as grpc_server
import json
import requests

class Movie(grpc_server.MovieServicer):
    def ListMovie(self, request, context):
        url = "https://api.themoviedb.org/3/movie/now_playing?language=en-US&page=1"
        headers = {
             "accept": "application/json",
             "Authorization": "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhMzFhNzkyMTA1ZTJhZmNlZWZjNjQ1MDA1ZGM3NTY5ZCIsIm5iZiI6MTQ2MDcyNDc3NC4xNTEsInN1YiI6IjU3MTBlNDI1YzNhMzY4NDEyMjAwM2FhMiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.lVqxa_XThwrB-obHwVQlmYuY6gYPChWo4v1tPpZdArc"
             }
        response = requests.get(url, headers=headers)
        return proto.MovieReply(message=response.text)
    


def serve():
    port = "50051"
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    grpc_server.add_MovieServicer_to_server(Movie(), server)
    server.add_insecure_port("[::]:" + port)
    server.start()
    print("Server started, listening on " + port)
    server.wait_for_termination()


if __name__ == "__main__":
    logging.basicConfig()
    serve()
