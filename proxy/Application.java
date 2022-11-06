import java.util.ArrayList;

public class Application {
    public static void main(String []args){
        ThirdPartyYoutubeLib youtubeThirdParty = createThirdPartyYoutube();
        Video video1 = new Video(1, "Video Number 0", "Video to learn how to cook");
        Video video2 = new Video(2, "Video Number 1", "How to program");
        Video video3 = new Video(3, "Video Number 2", "Jokes");
        youtubeThirdParty.setVideo(video1);
        youtubeThirdParty.setVideo(video2);
        youtubeThirdParty.setVideo(video3);
        
        System.out.println("-----------------------------------");

        ArrayList<Video> videos = youtubeThirdParty.listVideos();
        PrintVideos(videos);

        System.out.println("-----------------------------------");

        System.out.println("-- INFO: " + youtubeThirdParty.getVideoInfo(1));
        System.out.println("-- INFO: " + youtubeThirdParty.getVideoInfo(1));
        
        System.out.println("-----------------------------------");

        videos = youtubeThirdParty.listVideos();
        PrintVideos(videos);
        Video video4 = new Video(4, "Video Number 4", "Programming with Igor Takeo");
        youtubeThirdParty.setVideo(video4);
        videos = youtubeThirdParty.listVideos();
        PrintVideos(videos);

        System.out.println("-----------------------------------");
    }

    public static ThirdPartyYoutubeLib createThirdPartyYoutube(){
        ThirdPartyYoutubeClass youtubeClass = new ThirdPartyYoutubeClass();
        CacheYoutubeClass youtubeCache = new CacheYoutubeClass(youtubeClass);
        return youtubeCache;
    }

    public static void PrintVideos(ArrayList<Video> videos){
        for(Video video : videos){
            System.out.println(video.getName());
        }
    }
}