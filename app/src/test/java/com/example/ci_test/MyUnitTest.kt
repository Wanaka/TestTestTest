package com.example.ci_test

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class MyUnit    Test {

//    lateinit var SUT: Myfile
//
//    @Before
//    fun setup() {
//        SUT = Myfile()
//    }

    @Test
    fun sum() {
//        var result = SUT.sum(1, 3)
        assertEquals(4, 1 + 2)
    }
}