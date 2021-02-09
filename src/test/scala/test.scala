import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class test extends AnyFunSpec with Matchers {

  describe("main.gradingStudents") {

    it("should round up") {
      val testArr = Array(74, 67, 38, 33)
      val result = main.gradingStudents(testArr)
      result.length shouldBe 4
      result(0) shouldEqual 75
      result(1) shouldEqual 67
      result(2) shouldEqual 40
      result(3) shouldEqual 33
    }
  }
}
