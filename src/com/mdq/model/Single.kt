package com.mdq.model

/**
 * 单例模式推荐写法
 */
class Single private constructor() {
    companion object {
        fun get(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }
}