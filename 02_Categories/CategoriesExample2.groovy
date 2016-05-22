import groovy.time.TimeCategory

use (TimeCategory) {
    println (20.hours + 10.days.from.now)
    // Thu Jun 12 20:00:00 CET 2016
}


println TimeCategory.getHours(20).plus(TimeCategory.getDays(10).from.now)
// Thu Jun 12 20:00:00 CET 2016
