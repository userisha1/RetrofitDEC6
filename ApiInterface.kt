import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET

interface ApiInterface {
    @GET("https://stats.nba.com/allstarballotpredictor")
    fun getExampleData(): Call<ExampleResponse>
}