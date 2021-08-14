package UAS_10118381_MuhammadRizqiHidayatullah.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ApiClient implements Serializable {

    // TANGGAL PENGERJAAN : 08-AGUSTUS-2021
    // NIM : 10118381
    // NAMA : MUHAMMAD RIZQI HIDAYATULLAH
    // KELAS : IF-9

    public List<Place> places = new ArrayList<>();
    public List<PlaceCategory> place_category = new ArrayList<>();
    public List<Images> images = new ArrayList<>();

    public ApiClient() {
    }

    public ApiClient(List<Place> places, List<PlaceCategory> place_category, List<Images> images) {
        this.places = places;
        this.place_category = place_category;
        this.images = images;
    }
}
