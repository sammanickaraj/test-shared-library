def call(Map map = [:]){  
    stage("Image Creation") {
        println map.name
        println map.age
        println map.city
        echo map.name
    }
  }
