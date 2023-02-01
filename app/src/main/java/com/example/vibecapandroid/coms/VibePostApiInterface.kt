package com.example.vibecapandroid.coms

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

// 게시물 전체 조회(태그별)
interface VibePostTagInterface{
    @GET("app/posts")
    fun postAllCheck(
        @Query("tagName") tagName:String
    ): Call<PostTagResponse>
}

// 게시물 전체 조회(weekly)
interface VibePostWeeklyInterface{
    @GET("app/posts/weekly")
    fun postWeeklyCheck(
    ): Call<PostWeeklyResponse>
}
// 게시물 1개 조회
interface VibePostApiInterface {
    @GET("app/posts/{postId}")
    fun postDetailCheck(
        @Path("postId") postId:Int
    ): Call<PostDetailResponse>
}

// 게시물 작성
interface VibePostWriteInterface{
    @POST("app/posts")
    fun postWrite(
        @Body JsonBody: PostMember
    ): Call<PostWriteResponse>
}

// 게시물 수정
interface VibePostModifyInterface{
    @PATCH("app/posts/{postIdx}")
    fun postModify(

    )
}
// 게시물 삭제
interface VibePostDeleteInterface{
    @DELETE("app/posts/{postId}")
    fun postDelete(
        @Path("postId") postId: Int
    ):Call<PostDeleteResponse>
}