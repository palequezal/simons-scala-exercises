import java.time.LocalDate

class Task {

  val defaultDate = LocalDate.of(2020,3,1)

  /*
    This method should return:
    - the date provided if a date after 1st March 2020 is provided
    - return the default date if a date before 1st march was provided
    - return the default date if no date is provided

    add the correct method to make this work
   */
  def firstDayIWasSickOfCovid(optDate: Option[LocalDate]): LocalDate =
    optDate.filter(!_.isBefore(defaultDate)).getOrElse(defaultDate)

}
