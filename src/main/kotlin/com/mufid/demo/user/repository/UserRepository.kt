package com.mufid.demo.user.repository

import com.mufid.demo.user.entity.User

interface UserRepository {
    fun getUserByName(name: String): User?
    fun getUsers(): List<User>
    fun addUser(name: String): List<User>
}