package com.necisstudio.androidsamplegrpc

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.necisstudio.androidsamplegrpc.databinding.ActivityMainBinding
import com.necisstudio.emovie.MovieGrpcKt
import com.necisstudio.emovie.movieRequest
import io.grpc.ManagedChannelBuilder
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.asExecutor
import kotlinx.coroutines.launch
import java.io.Closeable

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val uri by lazy { Uri.parse(resources.getString(R.string.server_url)) }
    private val movieService by lazy { MovieRPC(uri) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        MainScope().launch {
            movieService.listMovie("message")
            binding.txtResponse.text = movieService.responseData.firstOrNull()
        }


    }


}
 class MovieRPC(uri: Uri):Closeable{
     var responseData = mutableSetOf<String>()
     val channel = let {
        println("Connecting to ${uri.host}:${uri.port}")

        val builder = ManagedChannelBuilder.forAddress(uri.host, uri.port)
        if (uri.scheme == "https") {
            builder.useTransportSecurity()
        } else {
            builder.usePlaintext()
        }

        builder.executor(Dispatchers.IO.asExecutor()).build()
    }

    val movie = MovieGrpcKt.MovieCoroutineStub(channel)

    suspend fun listMovie(name: String) {
        try {
            val request = movieRequest { this.name = name }
            val response = movie.listMovie(request)
            responseData.add(response.message)
            Log.e("message",response.message)
        } catch (e: Exception) {
            Log.e("error",e.message ?: "Unknown Error")
            responseData.add(e.message ?: "Unknown Error")
            e.printStackTrace()
        }
    }

    override fun close() {
        channel.shutdownNow()
    }
}