package workshop

class Workshop1Test extends munit.FunSuite:
  import Workshop1.*

  // ------ exercise 1 tests -----------------------------------------------------

  test("POTENCIA:") {
    assert(exercise1(2, 3) == 8)
    assert(exercise1(2, 0) == 1)
    assert(exercise1(2, 1) == 2)
  }
  
  // ------ exercise 2 tests ------------------------------------------------------

   test("FACTORIAL:") {
    assert(exercise2(5)==120)
    assert(exercise2(10)==3628800)
    assert(exercise2(7)==5040)
  }

  // ------ exercise 3 tests ------------------------------------------------------

  test("SUMATORIA:") {
    assert(exercise3(5)==15)
    assert(exercise3(10)==55)
    assert(exercise3(7)==28)
    assert(exercise3(0)==0)

    
    
  }

  // ------ exercise 4 tests ------------------------------------------------------

  test("SUMA:") {
    assert(exercise4(4,4)==8)
    assert(exercise4(5,5)==10)
    assert(exercise4(6,6)==12)
    assert(exercise4(7,7)==14)
    
  }

  // ------ exercise 5 tests ------------------------------------------------------

  test("RESTA:") {
    assert(exercise5(4,4)==0)
    assert(exercise5(5,5)==0)
    assert(exercise5(6,6)==0)
    assert(exercise5(10,1)==9)
    
  }

  // ------ exercise 6 tests ------------------------------------------------------

  test("PRODUCTO:") {
    assert(exercise6(4,4)==16)
    assert(exercise6(5,5)==25)
    assert(exercise6(6,6)==36)
    assert(exercise6(7,7)==49)

    
  }

  // ------ exercise 7 tests ------------------------------------------------------

  test("DIVISION:") {
    assert(exercise7(4,4)==1)
    assert(exercise7(5,5)==1)
    assert(exercise7(6,6)==1)
    assert(exercise7(10,1)==10)

    
  }

  // ------ exercise 8 tests ------------------------------------------------------

  test("MODULO:") {
    assert(exercise8(20,7)==6)
    assert(exercise8(20,5)==0)
    assert(exercise8(6,4)==2)
    
  }



  import scala.concurrent.duration.*
  override val munitTimeout = 10.seconds
