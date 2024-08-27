package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        MusicPlayer player = new MusicPlayer();
        player.play();
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play();

        MediaController mediaController = new MediaController();
        mediaController.playMedia(player);
        mediaController.playMedia(videoPlayer);
    }

}