package me.m1key.audiolicious.cloud.entities;

public class Song {

	private String name;
	private String albumName;
	private String artistName;
	private String songKey;

	public Song(String name, String albumName, String artistName, String songKey) {
		super();
		this.name = name;
		this.albumName = albumName;
		this.artistName = artistName;
		this.songKey = songKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getSongKey() {
		return songKey;
	}

	public void setSongKey(String songKey) {
		this.songKey = songKey;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((albumName == null) ? 0 : albumName.hashCode());
		result = prime * result
				+ ((artistName == null) ? 0 : artistName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((songKey == null) ? 0 : songKey.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (albumName == null) {
			if (other.albumName != null)
				return false;
		} else if (!albumName.equals(other.albumName))
			return false;
		if (artistName == null) {
			if (other.artistName != null)
				return false;
		} else if (!artistName.equals(other.artistName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (songKey == null) {
			if (other.songKey != null)
				return false;
		} else if (!songKey.equals(other.songKey))
			return false;
		return true;
	}

}
