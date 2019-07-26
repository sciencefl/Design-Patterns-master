package adapterpattern2;

public class MediaPlayerImpl implements MediaPlayer {
	public void play(String audioType,String fileName) {
		System.out.println("We play the MP3: "+fileName);
	}
}
