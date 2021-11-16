package com.sksamuel.kotest.example.allure

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.doubles.shouldBeExactly
import kotlin.math.pow

class CubeTest : DescribeSpec({
   describe("when cubing a number") {
      it("should be the cube value") {
         2.0.pow(3.0) shouldBeExactly 8.0
         (-4.0).pow(3.0) shouldBeExactly -64.0
         9.0.pow(3.0) shouldBeExactly 729.0
      }
   }
})
