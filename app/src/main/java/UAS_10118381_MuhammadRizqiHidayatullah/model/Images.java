package UAS_10118381_MuhammadRizqiHidayatullah.model;

import java.io.Serializable;

public class Images implements Serializable {

    // TANGGAL PENGERJAAN : 12-AGUSTUS-2021
    // NIM : 10118381
    // NAMA : MUHAMMAD RIZQI HIDAYATULLAH
    // KELAS : IF-9

    public int place_id;
    public String name;

    public Images() {
    }

    public Images(int place_id, String name) {
        this.place_id = place_id;
        this.name = name;
    }

    public String getImageUrl(){
        return name;
    }
}
