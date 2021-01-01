def call(Map map = [:]){
  node {
  
    stage("Image Creation") {
        println map.name
        println map.age
    }
  }
}
