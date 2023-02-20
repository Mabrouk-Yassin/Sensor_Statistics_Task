case class SensorMeasurment(sensorid:String,humidity : String)

object SensorStatistics {

  def main(args: Array[String]): Unit = {
    //var dir= args(0)
    var dir = "C:\\Users\\MABROUK\\Desktop\\Nouveau dossier\\SensorStatisticsTask\\src\\ReportDirectory"


    val sensorSpark=new SensorStaticSparkImpl()
    val noOfProcessedFile=sensorSpark.numOfProcessedFiles(dir)
    println("Num of processed files:" + noOfProcessedFile)
    val numOfProcessedMeasure=sensorSpark.numOfProcessedMeasurements()
    println("Num of processed measurements: "+numOfProcessedMeasure)
    val numOfFailedMeasure=sensorSpark.numOfFailedMeasurements()
    println("Num of failed measurements: "+numOfFailedMeasure)
    sensorSpark.minAvgMaxHumidity()
    sensorSpark.sortsSensorsByHighestAvgHumidity()
  }

}

