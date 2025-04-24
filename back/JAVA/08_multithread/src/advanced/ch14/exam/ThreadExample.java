package advanced.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        MovieThread movieThread = new MovieThread();
        Thread musicThread = new Thread(new MusicRunnable());
        movieThread.start();
        musicThread.start();
    

    }
}
