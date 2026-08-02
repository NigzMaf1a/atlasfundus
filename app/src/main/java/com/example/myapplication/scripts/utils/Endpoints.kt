package com.example.myapplication.scripts.utils

object Endpoints {

    const val LOGIN = "/api/auth/login"

    object User {
        const val POST = "/api/reg/post"
        const val GET = "/api/reg/get"

        fun patch(id: Int): String =
            "/api/reg/patch/$id"
    }

    object Sector {
        const val POST = "/api/sect/post"
        const val GET = "/api/sect/get"

        fun patch(id: Int): String =
            "/api/sect/patch/$id"
    }

    object Role {
        const val POST = "/api/roles/post"
        const val GET = "/api/roles/get"

        fun patch(id: Int): String =
            "/api/roles/patch/$id"
    }

    object Task {
        const val POST = "/api/task/post"
        const val GET = "/api/task/get"

        fun patch(id: Int): String =
            "/api/task/patch/$id"
    }

    object TaskAlloc {
        const val POST = "/api/alloc/post"
        const val GET = "/api/alloc/get"
    }
}