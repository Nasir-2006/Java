interface mediaplayer{
    void play();
}
 class AudioPlayer implements mediaplayer {
public void play()
{
    System.out.println("Gana baj raha he!!");
}
}
class VideoPlayer implements mediaplayer{
    public void play()
    {
        System.out.println("Video chal rahi he!!");
    }
} 
public class interfacee{
public static void main(String[] args) {
    mediaplayer m1 = new AudioPlayer();
    m1.play();
    mediaplayer m2 = new VideoPlayer();
    m2.play();
}
}