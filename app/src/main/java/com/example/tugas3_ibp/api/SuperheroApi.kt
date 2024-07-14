package com.example.tugas3_ibp.api

//Nama        : Indi Bagus Prasetyo ;
//NIM         : 10121902 ;
//Kelas       : IF9K ;
//Mata Kuliah : Pemrograman Android ;
//Dosen       : Rizki Adam Kurniawan, M.Kom. ;
//Selesai     : 14 Juli 2024. 13:03 ;

import com.example.tugas3_ibp.model.Superhero
import retrofit2.Call
import retrofit2.http.GET

interface SuperheroApi {
    @GET("api.php/d2c41038c1ccba2113b863d4e66d8040/234")
    fun getSuperhero(): Call<Superhero>
}
