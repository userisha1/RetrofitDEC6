fun getInstance(): Retrofit {
    val client = OkHttpClient()
    val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    val clientBuilder: OkHttpClient.Builder =
        client.newBuilder().addInterceptor(interceptor as HttpLoggingInterceptor)

    return Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(clientBuilder.build())
        .build()
}