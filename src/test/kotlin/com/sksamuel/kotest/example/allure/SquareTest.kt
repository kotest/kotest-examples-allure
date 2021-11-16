package com.sksamuel.kotest.example.allure

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.doubles.shouldBeExactly
import kotlin.math.pow

class SquareTest : FunSpec({

   test("positive square") {
      2.0.pow(2.0) shouldBeExactly 4.0
      4.0.pow(2.0) shouldBeExactly 16.0
      9.0.pow(2.0) shouldBeExactly 81.0
   }

   test("negative square") {
      (-2.0).pow(2.0) shouldBeExactly 4.0
      (-4.0).pow(2.0) shouldBeExactly 16.0
      (-9.0).pow(2.0) shouldBeExactly 81.0
   }

})

