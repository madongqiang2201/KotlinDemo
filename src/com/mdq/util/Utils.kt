package com.mdq.util

object Utils {
    @JvmStatic fun isEmpty(str: String?) : Boolean {
        return str == null || str == ""
    }
}