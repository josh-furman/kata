object main extends App {

  def gradingStudents(arr: Array[Int]): Array[Int] = {
//    def roundUp(grade: Int): Int = {
//      if (grade % 5 >= 3 && grade >= 38 ) {
//        grade + (5 - (grade % 5))
//      } else grade
//    }

    arr.map(grade => {
      if (grade % 5 >= 3 && grade >= 38 ) {
        grade + (5 - (grade % 5))
      } else grade

    })
  }
}