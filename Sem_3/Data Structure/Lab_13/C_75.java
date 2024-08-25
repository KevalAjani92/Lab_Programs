class MusicPlayer{
    class Song{
        String name;
        Song prev;
        Song next;

        public Song(String name){
            this.name = name;
            this.prev = null;
            this.next = null;
        }
    }
    public Song first = null,last = null;
    public int count = 0;
    public Song currentSong;
    public boolean isPlaying;
    public boolean currentPlaying;

    public void addSong(String name){
        Song newSong = new Song(name);
        if(last == null){
            first = last = newSong;
            count++;
            currentSong = first;
            return;
        }
        
        newSong.next = first;
        first.prev = newSong;
        first = newSong;
        count++;
        if(!(isPlaying)){
            currentSong = first;
        }
    }
    public void deleteSong(String name){
        if(first == null){
            System.out.println("PlayList Is Empty");
            return;
        }
        Song temp = first;
        while (temp != first && temp.name!=name) {
            temp = temp.next;
        }
        if(temp.name != name){
            System.out.println("Song Not Found");
            return;
        }
        if(temp==first){
            first = first.next;
            first.prev = null;
        }else if(temp == last){
            last = last.prev;
            last.next = null;
        }else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        count--;
    }
    
    public String playSong(){
        if(first == null){
            System.out.println("PlayList Is Empty");
            return null;
        }
        isPlaying = true;
        return currentSong.name;
    }
    public String playNextSong(){
        if(first == null){
            System.out.println("PlayList Is Empty");
            return null;
        }
        if(!(isPlaying)){
            isPlaying = true;
        }
        if (currentSong.next == null) {
            currentSong = first;
            return currentSong.name;
        }
        currentSong = currentSong.next;
        return currentSong.name;
    }
    public String playPreviousSong(){
        if(first == null){
            System.out.println("PlayList Is Empty");
            return null;
        }
        if(!(isPlaying)){
            isPlaying = true;
            currentPlaying =true;
        }
        if (currentSong.prev == null) {
            currentSong = last;
            return currentSong.name;
        }
        currentSong = currentSong.prev;
        return currentSong.name;
    }
    public void pauseSong(){
        if(first == null){
            System.out.println("PlayList Is Empty");
            return;
        }

        currentPlaying = false;
        System.out.println("Song Paused");
    }
}
public class C_75 {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();

        mp.addSong("Song1");
        System.out.println(mp.playSong());
        mp.addSong("Song2");
        // System.out.println(mp.playNextSong());
        mp.pauseSong();
        System.out.println(mp.playPreviousSong());
        
    }
}
