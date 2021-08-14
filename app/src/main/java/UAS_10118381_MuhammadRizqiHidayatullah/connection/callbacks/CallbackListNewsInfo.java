package UAS_10118381_MuhammadRizqiHidayatullah.connection.callbacks;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import UAS_10118381_MuhammadRizqiHidayatullah.model.NewsInfo;

public class CallbackListNewsInfo implements Serializable {

    // TANGGAL PENGERJAAN : 11-AGUSTUS-2021
    // NIM : 10118381
    // NAMA : MUHAMMAD RIZQI HIDAYATULLAH
    // KELAS : IF-9

    public String status = "";
    public int count = -1;
    public int count_total = -1;
    public int pages = -1;
    public List<NewsInfo> news_infos = new ArrayList<>();

}
