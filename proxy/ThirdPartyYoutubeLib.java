import java.util.ArrayList;

public interface ThirdPartyYoutubeLib {
    ArrayList<Video> listVideos();
    void setVideo(Video video);
    String getVideoInfo(int videoId);
}
