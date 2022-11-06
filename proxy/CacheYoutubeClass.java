import java.util.ArrayList;
import java.util.HashMap;

public class CacheYoutubeClass implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib service;
    private ArrayList<Video> cacheVideos;
    private HashMap<Integer, String> cachceVideoInformation;
    private boolean needUpdate;

    public CacheYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
        this.cacheVideos = new ArrayList<Video>();
        this.cachceVideoInformation = new HashMap<Integer, String>();
        this.needUpdate = true;
    }

    @Override
    public ArrayList<Video> listVideos() {
        if(cacheVideos.isEmpty() || needUpdate){
            System.out.println("** Updating cache...");
            cacheVideos = service.listVideos();
            needUpdate = false;
            return cacheVideos;
        }

        System.out.println("** Getting from cache...");
        return cacheVideos;
    }

    @Override
    public void setVideo(Video video) {
        service.setVideo(video);
        needUpdate = true;
    }

    @Override
    public String getVideoInfo(int videoId) {
        if(!cachceVideoInformation.containsKey(Integer.valueOf(videoId))){
            String information = service.getVideoInfo(videoId);
            cachceVideoInformation.put(Integer.valueOf(videoId), information);

            return information;
        }

        System.out.println("** Getting from cache...");

        return cachceVideoInformation.get(Integer.valueOf(videoId));
    }
    
}
