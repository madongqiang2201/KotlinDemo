package com.mdq.util

class StringUtils {
    companion object {
        fun isEmpty(content: String?) : Boolean {
            return content == null || content == ""
        }
    }
}
