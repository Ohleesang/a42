package com.example.a42

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(number: IntArray): Int {
                var answer: Int = 0
                var three = mutableListOf<Boolean>()
                for(i in 0 until number.size){
                    for( j in i+1 until number.size){
                        for(k in j+1 until number.size ){
                            if(number[i]+number[j]+number[k]==0)
                            three.add(true)
                        }
                    }
                }
                answer = three.size
                return answer
            }
        }
        val a = Solution()
        a.solution(intArrayOf(-2, 3, 0, 2, -5))
        a.solution(intArrayOf(-3, -2, -1, 0, 1, 2, 3))
        a.solution(intArrayOf(-1, 1, -1, 1))
    }
}