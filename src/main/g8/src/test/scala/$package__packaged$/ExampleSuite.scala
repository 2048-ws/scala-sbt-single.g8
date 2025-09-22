package $package$

import munit.FunSuite

class ExampleSuite extends FunSuite:
  test("add works"):
    assertEquals(Example.add(2,3), 5)
