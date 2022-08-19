package ru.synergy.kotlinpractice.players

open class Video {
    open fun play(){
        println("Play video")
    }

}

interface AudioPlayer{
    fun play(){
        println("Play Audio")
    }
}

class MediaPlayer(): Video(), AudioPlayer{

    override fun play() {
        super<Video>.play()
        super<AudioPlayer>.play()
    }

}