package com.guillaume.todo.network

import com.squareup.moshi.Json

/*

{
  "firstname": "guillaume",
  "lastname": "de sousa",
  "email": "dds1991@hotmail.fr",
  "password": "testtest",
  "password_confirmation": "testtest"
}

response
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyMjAsImV4cCI6MTYxMzA1MDM3Nn0.kJtjdL83JR4eVqqO6MAn8YIsN9ff9eLkKtU9AwQdV-g",
  "expire": "2021-02-11T14:32:56.102+01:00"
}

 */

data class UserInfo(
    @field:Json(name = "email")
    val email: String,
    @field:Json(name = "firstname")
    val firstName: String,
    @field:Json(name = "lastname")
    val lastName: String
)