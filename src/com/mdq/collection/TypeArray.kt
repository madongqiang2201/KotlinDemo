package com.mdq.collection

/**
 * in 的泛型，是只写泛型，只能当作参数传入，不能当作返回值传出
 * out 的泛型，是只读泛型，只能存入，不能读出与删除
 */
class TypeArray<in A> {
    fun getValue(a: A): Int? {
        return a?.hashCode()
    }

//    hashCodefun getA(a: A) : A {
//        return a
//    }
}