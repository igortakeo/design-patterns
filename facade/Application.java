public class Application {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}