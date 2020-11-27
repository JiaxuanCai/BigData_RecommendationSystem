import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}
object HelloWorld {
  Logger.getLogger("org").setLevel(Level.WARN)
  def main(args: Array[String]): Unit = {
    val DATA_PATH = "/home/frozenwhale/Desktop/bigdata/Ex2_WordCount/src/answers.txt"
    val conf = new SparkConf().setAppName("wordcount").setMaster("local")
    val sc = new SparkContext(conf)
    val rdd = sc.textFile(DATA_PATH)
    val counts = rdd.flatMap(line=>line.split(",")).map(x=>(x,1)).reduceByKey((x,y)=>(x+y))
    var some = counts.collect().take(10)
    some.foreach(println)
    sc.stop()
  }
}