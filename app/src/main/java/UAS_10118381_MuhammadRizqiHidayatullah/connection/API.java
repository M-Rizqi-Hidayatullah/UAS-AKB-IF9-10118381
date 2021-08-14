package UAS_10118381_MuhammadRizqiHidayatullah.connection;

import UAS_10118381_MuhammadRizqiHidayatullah.connection.callbacks.CallbackDevice;
import UAS_10118381_MuhammadRizqiHidayatullah.connection.callbacks.CallbackListNewsInfo;
import UAS_10118381_MuhammadRizqiHidayatullah.connection.callbacks.CallbackListPlace;
import UAS_10118381_MuhammadRizqiHidayatullah.connection.callbacks.CallbackPlaceDetails;
import UAS_10118381_MuhammadRizqiHidayatullah.model.DeviceInfo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface API {

    // TANGGAL PENGERJAAN : 10-AGUSTUS-2021
    // NIM : 10118381
    // NAMA : MUHAMMAD RIZQI HIDAYATULLAH
    // KELAS : IF-9

    String CACHE = "Cache-Control: max-age=0";
    String AGENT = "User-Agent: Place";

    @Headers({CACHE, AGENT})
    @GET("app/services/listPlaces")
    Call<CallbackListPlace> getPlacesByPage(
            @Query("page") int page,
            @Query("count") int count,
            @Query("draft") int draft
    );

    @Headers({CACHE, AGENT})
    @GET("app/services/getPlaceDetails")
    Call<CallbackPlaceDetails> getPlaceDetails(
            @Query("place_id") int place_id
    );

    @Headers({CACHE, AGENT})
    @GET("app/services/listNewsInfo")
    Call<CallbackListNewsInfo> getNewsInfoByPage(
            @Query("page") int page,
            @Query("count") int count
    );

    @Headers({CACHE, AGENT})
    @POST("app/services/insertGcm")
    Call<CallbackDevice> registerDevice(
            @Body DeviceInfo deviceInfo
    );

}
