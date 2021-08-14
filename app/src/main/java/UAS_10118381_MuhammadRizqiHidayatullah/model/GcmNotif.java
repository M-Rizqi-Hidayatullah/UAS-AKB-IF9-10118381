package UAS_10118381_MuhammadRizqiHidayatullah.model;

import java.io.Serializable;

public class GcmNotif implements Serializable {

    // TANGGAL PENGERJAAN : 12-AGUSTUS-2021
    // NIM : 10118381
    // NAMA : MUHAMMAD RIZQI HIDAYATULLAH
    // KELAS : IF-9

    private String title, content, type;
    private Place place;
    private NewsInfo news;

    public GcmNotif() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public NewsInfo getNews() {
        return news;
    }

    public void setNews(NewsInfo news) {
        this.news = news;
    }

}
