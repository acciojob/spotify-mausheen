package com.driver;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class SpotifyRepository {
    public HashMap<Artist, List<Album>> artistAlbumMap;
    public HashMap<Album, List<Song>> albumSongMap;
    public HashMap<Playlist, List<Song>> playlistSongMap;
    public HashMap<Playlist, List<User>> playlistListenerMap;
    public HashMap<User, Playlist> creatorPlaylistMap;
    public HashMap<User, List<Playlist>> userPlaylistMap;
    public HashMap<Song, List<User>> songLikeMap;

    public List<User> users;
    public List<Song> songs;
    public List<Song> likeSongs;
    public List<Playlist> playlists;
    public List<Album> albums;
    public List<Artist> artists;
    public List<Playlist> playlistOnLength;
    public List<Playlist> playlistOnName;


    public SpotifyRepository(){
        //To avoid hitting apis multiple times, initialize all the hashmaps here with some dummy data
        artistAlbumMap = new HashMap<>();
        albumSongMap = new HashMap<>();
        playlistSongMap = new HashMap<>();
        playlistListenerMap = new HashMap<>();
        creatorPlaylistMap = new HashMap<>();
        userPlaylistMap = new HashMap<>();
        songLikeMap = new HashMap<>();

        users = new ArrayList<>();
        songs = new ArrayList<>();
        likeSongs= new ArrayList<>();
        playlists = new ArrayList<>();
        albums = new ArrayList<>();
        artists = new ArrayList<>();
        playlistOnLength=new ArrayList<>();
        playlistOnName=new ArrayList<>();

    }

    public User createUser(String name, String mobile) {
        User user=new User();
        user.setName(name);
        user.setMobile(mobile);
        users.add(user);

        return user;
    }

    public Artist createArtist(String name) {
        Artist artist=new Artist();
        artist.setName(name);
        artists.add(artist);
        return artist;
    }

    public Album createAlbum(String title, String artistName) {
        Album album=new Album();

        album.setTitle(title);
        album.setArtist(artistName);
        albums.add(album);
        return album;

    }

    public Song createSong(String title, String albumName, int length) throws Exception{
        Song song=new Song();
        song.setLength(length);
        song.setTitleName(albumName);
        song.setTitle(title);
        songs.add(song);
        return song;

    }

    public Playlist createPlaylistOnLength(String mobile, String title, int length) throws Exception {
        Playlist playlist=new Playlist();
        playlist.setLength(length);
        playlist.setMobile(mobile);
        playlist.setTitle(title);

        playlistOnLength.add(playlist);

      return playlist;
    }

    public Playlist createPlaylistOnName(String mobile, String title, List<String> songTitles) throws Exception {

        Playlist playlist=new Playlist();
        playlist.setMobile(mobile);
        playlist.setSongTitles(songTitles);
        playlist.setTitle(title);
          playlistOnName.add(playlist);
          return playlist;
    }

    public Playlist findPlaylist(String mobile, String playlistTitle) throws Exception {
        Playlist playlist=new Playlist();
        playlist.setMobile(mobile);
        playlist.setTitle(playlistTitle);

        playlists.add(playlist);
        return playlist;
    }

    public Song likeSong(String mobile, String songTitle) throws Exception {
        Song song=new Song();
        song.setTitle(songTitle);
        song.setMobile(mobile);
        song.setLikes(1);
        likeSongs.add(song);

        return song;

    }

    public String mostPopularArtist() {
        return "Most popular Artist";
    }

    public String mostPopularSong() {

        return "Most popular song";
    }
}
