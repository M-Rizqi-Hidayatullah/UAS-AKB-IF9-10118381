package UAS_10118381_MuhammadRizqiHidayatullah.data;

public class Constant {

    // TANGGAL PENGERJAAN : 08-AGUSTUS-2021
    // NIM : 10118381
    // NAMA : MUHAMMAD RIZQI HIDAYATULLAH
    // KELAS : IF-9

    public static String WEB_URL = "https://uas10118381.000webhostapp.com/";

    public static final double city_lat = -6.9174639;
    public static final double city_lng = 107.6191228;

    public static final String PROJECT_API_NUMBER = "410478095074";


    public static String getURLimgPlace(String file_name) {
        return WEB_URL + "uploads/place/" + file_name;
    }
    public static String getURLimgNews(String file_name) {
        return WEB_URL + "uploads/news/" + file_name;
    }

    public static final int LIMIT_PLACE_REQUEST = 40;
    public static final int LIMIT_LOADMORE = 40;

    public static final int LIMIT_NEWS_REQUEST = 40;

    public static int LOAD_IMAGE_NOTIF_RETRY = 3;

    public static final String LOG_TAG = "CITY_LOG";

    public enum Event {
        FAVORITES,
        THEME,
        NOTIFICATION,
        REFRESH
    }

}
