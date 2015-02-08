@GrabResolver(name="netty snapshots", root="http://clinker.netty.io/nexus/content/repositories/snapshots")
@GrabResolver(name="OJO", root="https://oss.jfrog.org/artifactory/repo")
@Grab("io.ratpack:ratpack-groovy:0.9.13")
import static ratpack.groovy.Groovy.ratpack

ratpack {
    handlers {
    	 get {
        	response.send "I have answers, try /shout"
        }
        get("shout") {
        	response.send "Ratpack is super cool!!!!"
        }
    }
}
