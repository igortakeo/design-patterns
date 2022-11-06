import java.util.ArrayList;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

    private ArrayList<Video> videos;


    @Override
    public ArrayList<Video> listVideos() {
        System.out.println("** Getting information from service...");
        return videos;
    }

    @Override
    public void setVideo(Video video) {
        if(getVideos() == null){
            setVideos(new ArrayList<Video>());
        }

        videos.add(video);
    }

    @Override
    public String getVideoInfo(int videoId) {
        System.out.println("** Getting information from service...");

        for(Video video : videos){
            if(video.getId() == videoId){
                return video.getData();
            }
        }

        System.out.println("** Video don't exist!");

        return null;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
    
}
