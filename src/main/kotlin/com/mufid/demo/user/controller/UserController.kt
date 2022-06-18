package com.mufid.demo.user.controller

import com.mufid.demo.BaseResponse
import com.mufid.demo.user.entity.User
import com.mufid.demo.user.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/user")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping
    fun getUser(): BaseResponse<List<User>> {
        return BaseResponse(true, "success", userService.getUsers())
    }

    @PostMapping
    fun addUsers(
        @RequestBody user: User
    ): BaseResponse<List<User>> {
        return BaseResponse(true, "success", userService.addUser(user))
    }

    @GetMapping("/{name}")
    fun getUser(
        @PathVariable(value = "name") name: String
    ): BaseResponse<User>? {
        return BaseResponse(true, "success", userService.getUserByName(name))
    }

    @GetMapping("/ids")
    fun getIds(): BaseResponse<List<String>>? {
        return BaseResponse(true, "success", userService.getIds())
    }
}