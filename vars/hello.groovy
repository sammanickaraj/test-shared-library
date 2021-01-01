def call(Map map = [:]){  
    stage("Image Creation") {
        println map.name
        println map.age
        println map.city
        echo name
        echo map.name
    }
  }
