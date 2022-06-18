package com.mufid.demo.user.service

import com.mufid.demo.user.entity.User

interface UserService {
    fun getUserByName(name: String): User?
    fun getUsers(): List<User>
    fun addUser(user: User): List<User>
    fun getIds(): List<String>
}