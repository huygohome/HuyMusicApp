package com.example.nghenhac;

import java.io.Serializable;

public class Song implements Serializable {
    private int imageResId; // Resource ID của ảnh minh họa
    private String name;    // Tên bài hát
    private String artist;  // Nghệ sĩ
    private String duration; // Thời lượng bài hát
    private String filePath; // Đường dẫn đến file nhạc     // Đối với nhạc online (URL)
    private long lastPlayed; // Thời gian phát cuối cùng
    public Song(int imageResId, String name, String artist, String duration, String filePath) {
        this.imageResId = imageResId;
        this.name = name;
        this.artist = artist;
        this.duration = duration;
        this.filePath = filePath;

    }
    public long getLastPlayed() {
        return lastPlayed;
    }

    public void setLastPlayed(long lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    // Getter methods
    public int getImageResId() { return imageResId; }
    public String getName() { return name; }
    public String getArtist() { return artist; }
    public String getDuration() { return duration; }
    public String getFilePath() { return filePath; }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Nếu là cùng tham chiếu
        if (obj == null || getClass() != obj.getClass()) return false; // Kiểm tra null và loại đối tượng

        Song song = (Song) obj;
        // So sánh dựa trên filePath (hoặc các thuộc tính quan trọng khác nếu cần)
        return filePath != null && filePath.equals(song.filePath);
    }

    @Override
    public int hashCode() {
        // Sử dụng filePath để tính toán hashCode
        return filePath != null ? filePath.hashCode() : 0;
    }

    // Setter methods (nếu cần thiết)
    public void setImageResId(int imageResId) { this.imageResId = imageResId; }
    public void setName(String name) { this.name = name; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setDuration(String duration) { this.duration = duration; }
    public void setFilePath(String filePath) { this.filePath = filePath; }
}
